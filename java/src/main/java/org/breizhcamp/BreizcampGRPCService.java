package org.breizhcamp;

import com.google.protobuf.ByteString;
import com.google.rpc.Code;
import com.google.rpc.Status;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;
import org.breizhcamp.grpc.CreateSessionReply;
import org.breizhcamp.grpc.CreateSessionRequest;
import org.breizhcamp.grpc.GuessANumberReply;
import org.breizhcamp.grpc.GuessANumberRequest;
import org.breizhcamp.grpc.StatusCode;
import org.breizhcamp.grpc.breizhcampGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


import static org.breizhcamp.UuidUtils.asBytes;
import static org.breizhcamp.UuidUtils.asUuid;


public class BreizcampGRPCService extends breizhcampGrpc.breizhcampImplBase {

	private final static Logger log = LoggerFactory.getLogger(BreizcampGRPCService.class);
	private final Map<UUID, Integer> sessions = new HashMap<>();
	private final Random r = new Random();
	private final int MAX = 100000;
	private Server server = null;


	public void createSession(CreateSessionRequest createSessionRequest, StreamObserver<CreateSessionReply> replyStreamObserver) {
		UUID uuid = UUID.randomUUID();
		int number = r.nextInt(MAX);
		sessions.put(uuid, number);
		log.info("token=" + uuid + " numberToGuess=" + number);
		CreateSessionReply reply = CreateSessionReply.newBuilder().setToken(ByteString.copyFrom(asBytes(uuid))).build();
		replyStreamObserver.onNext(reply);
		replyStreamObserver.onCompleted();
	}

	public void guessANumber(GuessANumberRequest guessANumberRequest, StreamObserver<GuessANumberReply> guessANumberReplyStreamObserver) {

		Integer number = sessions.get(asUuid(guessANumberRequest.getToken().toByteArray()));
		if (number == null) {
			Status status = com.google.rpc.Status.newBuilder()
					.setCode(Code.INVALID_ARGUMENT.getNumber())
					.setMessage("Invalid token")
					.build();
			guessANumberReplyStreamObserver.onError(StatusProto.toStatusRuntimeException(status));
		} else {
			GuessANumberReply reply;
			if (guessANumberRequest.getNumber() > MAX) {
				Status status = com.google.rpc.Status.newBuilder()
						.setCode(com.google.rpc.Code.INVALID_ARGUMENT.getNumber())
						.setMessage("Number to high")
						.build();
				guessANumberReplyStreamObserver.onError(StatusProto.toStatusRuntimeException(status));
			} else {

				if (guessANumberRequest.getNumber() > number) {
					log.info("received : "+guessANumberRequest.getNumber() + " return=GREATER");
					reply = GuessANumberReply.newBuilder().setFound(StatusCode.GREATER).build();
				} else if (guessANumberRequest.getNumber() < number) {
					log.info("received : "+guessANumberRequest.getNumber() + " return=LOWER");
					reply = GuessANumberReply.newBuilder().setFound(StatusCode.LOWER).build();
				} else {
					log.info("received : "+guessANumberRequest.getNumber()+ " return=FOUND");
					reply = GuessANumberReply.newBuilder().setFound(StatusCode.FOUND).build();
				}
				guessANumberReplyStreamObserver.onNext(reply);
				guessANumberReplyStreamObserver.onCompleted();
			}
		}

	}

	public void start(int port) throws IOException {
		BreizcampGRPCService breizcampGRPCService = new BreizcampGRPCService();
		server = ServerBuilder.forPort(port)
				.addService(breizcampGRPCService)
				.build()
				.start();

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				log.info("*** shutting down gRPC server since JVM is shutting down");
				try {
					server.shutdown().awaitTermination(100, TimeUnit.SECONDS);
					;
				} catch (InterruptedException e) {
					log.error("Interrupted ",e);
				}
				log.info("*** server shut down");
			}
		});
	}

	public void awaitTermination() throws InterruptedException {
		server.awaitTermination();
	}

	public void shutdownNow(){
		server.shutdownNow();
	}

	public static void main(String[] args) {
		try {
			BreizcampGRPCService service = new BreizcampGRPCService();
			service.start(56000);
			service.awaitTermination();

		} catch (InterruptedException e) {
			log.error("Interrupted ",e);
		} catch (IOException e) {
			log.error("IOError ",e);
		}
	}
}