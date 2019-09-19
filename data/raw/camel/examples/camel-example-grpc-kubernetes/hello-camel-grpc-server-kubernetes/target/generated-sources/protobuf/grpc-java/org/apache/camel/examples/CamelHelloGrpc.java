package org.apache.camel.examples;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The camel hello service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: hellocamel.proto")
public final class CamelHelloGrpc {

  private CamelHelloGrpc() {}

  public static final String SERVICE_NAME = "org.apache.camel.examples.CamelHello";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.camel.examples.CamelHelloRequest,
      org.apache.camel.examples.CamelHelloReply> METHOD_SAY_HELLO_TO_CAMEL =
      io.grpc.MethodDescriptor.<org.apache.camel.examples.CamelHelloRequest, org.apache.camel.examples.CamelHelloReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.apache.camel.examples.CamelHello", "SayHelloToCamel"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.apache.camel.examples.CamelHelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.apache.camel.examples.CamelHelloReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CamelHelloStub newStub(io.grpc.Channel channel) {
    return new CamelHelloStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CamelHelloBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CamelHelloBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CamelHelloFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CamelHelloFutureStub(channel);
  }

  /**
   * <pre>
   * The camel hello service definition.
   * </pre>
   */
  public static abstract class CamelHelloImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHelloToCamel(org.apache.camel.examples.CamelHelloRequest request,
        io.grpc.stub.StreamObserver<org.apache.camel.examples.CamelHelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO_TO_CAMEL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO_TO_CAMEL,
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.camel.examples.CamelHelloRequest,
                org.apache.camel.examples.CamelHelloReply>(
                  this, METHODID_SAY_HELLO_TO_CAMEL)))
          .build();
    }
  }

  /**
   * <pre>
   * The camel hello service definition.
   * </pre>
   */
  public static final class CamelHelloStub extends io.grpc.stub.AbstractStub<CamelHelloStub> {
    private CamelHelloStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CamelHelloStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CamelHelloStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CamelHelloStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHelloToCamel(org.apache.camel.examples.CamelHelloRequest request,
        io.grpc.stub.StreamObserver<org.apache.camel.examples.CamelHelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_TO_CAMEL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The camel hello service definition.
   * </pre>
   */
  public static final class CamelHelloBlockingStub extends io.grpc.stub.AbstractStub<CamelHelloBlockingStub> {
    private CamelHelloBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CamelHelloBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CamelHelloBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CamelHelloBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public org.apache.camel.examples.CamelHelloReply sayHelloToCamel(org.apache.camel.examples.CamelHelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO_TO_CAMEL, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The camel hello service definition.
   * </pre>
   */
  public static final class CamelHelloFutureStub extends io.grpc.stub.AbstractStub<CamelHelloFutureStub> {
    private CamelHelloFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CamelHelloFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CamelHelloFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CamelHelloFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.camel.examples.CamelHelloReply> sayHelloToCamel(
        org.apache.camel.examples.CamelHelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_TO_CAMEL, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO_TO_CAMEL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CamelHelloImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CamelHelloImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_TO_CAMEL:
          serviceImpl.sayHelloToCamel((org.apache.camel.examples.CamelHelloRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.camel.examples.CamelHelloReply>) responseObserver);
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

  private static final class CamelHelloDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.camel.examples.HelloCamelProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CamelHelloGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CamelHelloDescriptorSupplier())
              .addMethod(METHOD_SAY_HELLO_TO_CAMEL)
              .build();
        }
      }
    }
    return result;
  }
}
