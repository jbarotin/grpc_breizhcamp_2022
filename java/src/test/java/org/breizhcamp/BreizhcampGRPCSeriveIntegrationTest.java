package org.breizhcamp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.breizhcamp.grpc.CreateSessionReply;
import org.breizhcamp.grpc.CreateSessionRequest;
import org.breizhcamp.grpc.GuessANumberRequest;
import org.breizhcamp.grpc.breizhcampGrpc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BreizhcampGRPCSeriveIntegrationTest
{
    private final static int TEST_PORT = 15000;
    private BreizcampGRPCService breizcampGRPCService = null;

    @BeforeEach
    public void startupServer() throws IOException {
        breizcampGRPCService = new BreizcampGRPCService();
        breizcampGRPCService.start(TEST_PORT);
    }

    @AfterEach
    public void shutdown(){
        breizcampGRPCService.shutdownNow();
    }


    @Test
    public void tryToExecuteBreizhcampService()
    {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:" + TEST_PORT)
                .usePlaintext()
                .build();
        breizhcampGrpc.breizhcampBlockingStub stub = breizhcampGrpc.newBlockingStub(channel);
        try {

            CreateSessionRequest createSessionRequest = CreateSessionRequest.newBuilder().setUserName("test").build();

            CreateSessionReply reply = stub.createSession(createSessionRequest);
            assertNotEquals(reply.getToken(),null);

            final GuessANumberRequest guessANumberRequest = GuessANumberRequest.newBuilder().setNumber(105000).setToken(reply.getToken()).build();
            assertThrows(io.grpc.StatusRuntimeException.class, () -> stub.guessANumber(guessANumberRequest));
        }finally {
            channel.shutdownNow();
        }
    }
}
