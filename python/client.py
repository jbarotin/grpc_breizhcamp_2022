import grpc
import breizhcamp_pb2
import breizhcamp_pb2_grpc
import random

with grpc.insecure_channel("127.0.0.1:56000") as channel:

    stub = breizhcamp_pb2_grpc.breizhcampStub(channel)
    request = breizhcamp_pb2.CreateSessionRequest(userName="user1")

    response = stub.CreateSession(request)
    token = response.token
    found = False;
    max = 100000
    number = random.randrange(0, max);
    min = 0
    while not found:
        print(f"try {number}")
        request = breizhcamp_pb2.GuessANumberRequest(token=token, number=number)
        reply = stub.GuessANumber(request)
        if reply.found == breizhcamp_pb2.StatusCode.FOUND:
            found = True
        elif reply.found == breizhcamp_pb2.StatusCode.GREATER:
            max = number
        else:
            min = number

        number = int((max - min) / 2) + min

    print(f"found {number}")