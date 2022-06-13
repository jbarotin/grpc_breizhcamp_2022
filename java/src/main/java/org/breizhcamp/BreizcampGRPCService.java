package org.breizhcamp;

import com.google.protobuf.ByteString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.breizhcamp.grpc.CreateSessionReply;
import org.breizhcamp.grpc.CreateSessionRequest;
import org.breizhcamp.grpc.GuessANumberReply;
import org.breizhcamp.grpc.GuessANumberRequest;
import org.breizhcamp.grpc.StatusCode;
import org.breizhcamp.grpc.breizhcampGrpc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


import static org.breizhcamp.UuidUtils.asBytes;
import static org.breizhcamp.UuidUtils.asUuid;


public class BreizcampGRPCService extends breizhcampGrpc.breizhcampImplBase {

	private Map<UUID, Integer> sessions = new HashMap<>();
	private Random r = new Random();

	private void log(String s){
		System.out.println(s);
	}

	public void createSession(CreateSessionRequest createSessionRequest, StreamObserver<CreateSessionReply> replyStreamObserver) {
		UUID uuid = UUID.randomUUID();
		int number = r.nextInt(100000);
		sessions.put(uuid, number);
		log(""+uuid+" "+number);
		CreateSessionReply reply = CreateSessionReply.newBuilder().setToken(ByteString.copyFrom(asBytes(uuid))).build();
		replyStreamObserver.onNext(reply);
		replyStreamObserver.onCompleted();
	}

	public void guessANumber(GuessANumberRequest guessANumberRequest, StreamObserver<GuessANumberReply> guessANumberReplyStreamObserver) {

		int number = sessions.get(asUuid(guessANumberRequest.getToken().toByteArray()));
		GuessANumberReply reply;
		if (guessANumberRequest.getNumber() > number) {
			log(guessANumberRequest.getNumber()+" GREATER");
			reply = GuessANumberReply.newBuilder().setFound(StatusCode.GREATER).build();
		} else if (guessANumberRequest.getNumber() < number) {
			log(guessANumberRequest.getNumber()+ " LOWER");
			reply = GuessANumberReply.newBuilder().setFound(StatusCode.LOWER).build();
		} else {
			log("FOUND");
			reply = GuessANumberReply.newBuilder().setFound(StatusCode.FOUND).build();
		}
		guessANumberReplyStreamObserver.onNext(reply);
		guessANumberReplyStreamObserver.onCompleted();
	}

	public static void main(String[] args) {
		BreizcampGRPCService breizcampGRPCService = new BreizcampGRPCService();
		try {
			Server server = ServerBuilder.forPort(56000)
										 .addService(breizcampGRPCService)
										 .build()
					                     .start();

			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					System.out.println("*** shutting down gRPC server since JVM is shutting down");
					try {
						server.shutdown().awaitTermination(100, TimeUnit.SECONDS);;
					} catch (InterruptedException e) {
						e.printStackTrace(System.err);
					}
					System.out.println("*** server shut down");
				}
			});
			server.awaitTermination();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
