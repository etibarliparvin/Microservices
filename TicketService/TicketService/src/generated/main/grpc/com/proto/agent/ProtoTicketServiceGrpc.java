package com.proto.agent;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: agent/agent.proto")
public final class ProtoTicketServiceGrpc {

  private ProtoTicketServiceGrpc() {}

  public static final String SERVICE_NAME = "agent.ProtoTicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.agent.ProtoFindByIdRequest,
      com.proto.agent.ProtoTicketResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = com.proto.agent.ProtoFindByIdRequest.class,
      responseType = com.proto.agent.ProtoTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.agent.ProtoFindByIdRequest,
      com.proto.agent.ProtoTicketResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.proto.agent.ProtoFindByIdRequest, com.proto.agent.ProtoTicketResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ProtoTicketServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ProtoTicketServiceGrpc.class) {
        if ((getFindByIdMethod = ProtoTicketServiceGrpc.getFindByIdMethod) == null) {
          ProtoTicketServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.proto.agent.ProtoFindByIdRequest, com.proto.agent.ProtoTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.agent.ProtoFindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.agent.ProtoTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProtoTicketServiceMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.agent.ProtoTicketRequest,
      com.proto.agent.ProtoTicketResponse> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicket",
      requestType = com.proto.agent.ProtoTicketRequest.class,
      responseType = com.proto.agent.ProtoTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.agent.ProtoTicketRequest,
      com.proto.agent.ProtoTicketResponse> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<com.proto.agent.ProtoTicketRequest, com.proto.agent.ProtoTicketResponse> getCreateTicketMethod;
    if ((getCreateTicketMethod = ProtoTicketServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (ProtoTicketServiceGrpc.class) {
        if ((getCreateTicketMethod = ProtoTicketServiceGrpc.getCreateTicketMethod) == null) {
          ProtoTicketServiceGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<com.proto.agent.ProtoTicketRequest, com.proto.agent.ProtoTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.agent.ProtoTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.agent.ProtoTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProtoTicketServiceMethodDescriptorSupplier("createTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProtoTicketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtoTicketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtoTicketServiceStub>() {
        @java.lang.Override
        public ProtoTicketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtoTicketServiceStub(channel, callOptions);
        }
      };
    return ProtoTicketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProtoTicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtoTicketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtoTicketServiceBlockingStub>() {
        @java.lang.Override
        public ProtoTicketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtoTicketServiceBlockingStub(channel, callOptions);
        }
      };
    return ProtoTicketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProtoTicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtoTicketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtoTicketServiceFutureStub>() {
        @java.lang.Override
        public ProtoTicketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtoTicketServiceFutureStub(channel, callOptions);
        }
      };
    return ProtoTicketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProtoTicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(com.proto.agent.ProtoFindByIdRequest request,
        io.grpc.stub.StreamObserver<com.proto.agent.ProtoTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void createTicket(com.proto.agent.ProtoTicketRequest request,
        io.grpc.stub.StreamObserver<com.proto.agent.ProtoTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.agent.ProtoFindByIdRequest,
                com.proto.agent.ProtoTicketResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getCreateTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.agent.ProtoTicketRequest,
                com.proto.agent.ProtoTicketResponse>(
                  this, METHODID_CREATE_TICKET)))
          .build();
    }
  }

  /**
   */
  public static final class ProtoTicketServiceStub extends io.grpc.stub.AbstractAsyncStub<ProtoTicketServiceStub> {
    private ProtoTicketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtoTicketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtoTicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void findById(com.proto.agent.ProtoFindByIdRequest request,
        io.grpc.stub.StreamObserver<com.proto.agent.ProtoTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTicket(com.proto.agent.ProtoTicketRequest request,
        io.grpc.stub.StreamObserver<com.proto.agent.ProtoTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProtoTicketServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProtoTicketServiceBlockingStub> {
    private ProtoTicketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtoTicketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtoTicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.agent.ProtoTicketResponse findById(com.proto.agent.ProtoFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.agent.ProtoTicketResponse createTicket(com.proto.agent.ProtoTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProtoTicketServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProtoTicketServiceFutureStub> {
    private ProtoTicketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtoTicketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtoTicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.agent.ProtoTicketResponse> findById(
        com.proto.agent.ProtoFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.agent.ProtoTicketResponse> createTicket(
        com.proto.agent.ProtoTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_CREATE_TICKET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProtoTicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProtoTicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.proto.agent.ProtoFindByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.agent.ProtoTicketResponse>) responseObserver);
          break;
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((com.proto.agent.ProtoTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.agent.ProtoTicketResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProtoTicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProtoTicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.agent.Agent.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProtoTicketService");
    }
  }

  private static final class ProtoTicketServiceFileDescriptorSupplier
      extends ProtoTicketServiceBaseDescriptorSupplier {
    ProtoTicketServiceFileDescriptorSupplier() {}
  }

  private static final class ProtoTicketServiceMethodDescriptorSupplier
      extends ProtoTicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProtoTicketServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProtoTicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProtoTicketServiceFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getCreateTicketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
