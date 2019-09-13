package org.apache.pulsar.functions.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: InstanceCommunication.proto")
public final class InstanceControlGrpc {

  private InstanceControlGrpc() {}

  public static final String SERVICE_NAME = "proto.InstanceControl";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFunctionStatusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> METHOD_GET_FUNCTION_STATUS = getGetFunctionStatusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethod() {
    return getGetFunctionStatusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getGetFunctionStatusMethod;
    if ((getGetFunctionStatusMethod = InstanceControlGrpc.getGetFunctionStatusMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getGetFunctionStatusMethod = InstanceControlGrpc.getGetFunctionStatusMethod) == null) {
          InstanceControlGrpc.getGetFunctionStatusMethod = getGetFunctionStatusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.InstanceControl", "GetFunctionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("GetFunctionStatus"))
                  .build();
          }
        }
     }
     return getGetFunctionStatusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAndResetMetricsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> METHOD_GET_AND_RESET_METRICS = getGetAndResetMetricsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethod() {
    return getGetAndResetMetricsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetAndResetMetricsMethod;
    if ((getGetAndResetMetricsMethod = InstanceControlGrpc.getGetAndResetMetricsMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getGetAndResetMetricsMethod = InstanceControlGrpc.getGetAndResetMetricsMethod) == null) {
          InstanceControlGrpc.getGetAndResetMetricsMethod = getGetAndResetMetricsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.InstanceControl", "GetAndResetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("GetAndResetMetrics"))
                  .build();
          }
        }
     }
     return getGetAndResetMetricsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getResetMetricsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_RESET_METRICS = getResetMetricsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResetMetricsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResetMetricsMethod() {
    return getResetMetricsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResetMetricsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getResetMetricsMethod;
    if ((getResetMetricsMethod = InstanceControlGrpc.getResetMetricsMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getResetMetricsMethod = InstanceControlGrpc.getResetMetricsMethod) == null) {
          InstanceControlGrpc.getResetMetricsMethod = getResetMetricsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.InstanceControl", "ResetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("ResetMetrics"))
                  .build();
          }
        }
     }
     return getResetMetricsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMetricsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> METHOD_GET_METRICS = getGetMetricsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethod() {
    return getGetMetricsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getGetMetricsMethod;
    if ((getGetMetricsMethod = InstanceControlGrpc.getGetMetricsMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getGetMetricsMethod = InstanceControlGrpc.getGetMetricsMethod) == null) {
          InstanceControlGrpc.getGetMetricsMethod = getGetMetricsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.InstanceControl", "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("GetMetrics"))
                  .build();
          }
        }
     }
     return getGetMetricsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getHealthCheckMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> METHOD_HEALTH_CHECK = getHealthCheckMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethod() {
    return getHealthCheckMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> getHealthCheckMethod;
    if ((getHealthCheckMethod = InstanceControlGrpc.getHealthCheckMethod) == null) {
      synchronized (InstanceControlGrpc.class) {
        if ((getHealthCheckMethod = InstanceControlGrpc.getHealthCheckMethod) == null) {
          InstanceControlGrpc.getHealthCheckMethod = getHealthCheckMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.InstanceControl", "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceControlMethodDescriptorSupplier("HealthCheck"))
                  .build();
          }
        }
     }
     return getHealthCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceControlStub newStub(io.grpc.Channel channel) {
    return new InstanceControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceControlFutureStub(channel);
  }

  /**
   */
  public static abstract class InstanceControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFunctionStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFunctionStatusMethodHelper(), responseObserver);
    }

    /**
     */
    public void getAndResetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAndResetMetricsMethodHelper(), responseObserver);
    }

    /**
     */
    public void resetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResetMetricsMethodHelper(), responseObserver);
    }

    /**
     */
    public void getMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMetricsMethodHelper(), responseObserver);
    }

    /**
     */
    public void healthCheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthCheckMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFunctionStatusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus>(
                  this, METHODID_GET_FUNCTION_STATUS)))
          .addMethod(
            getGetAndResetMetricsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>(
                  this, METHODID_GET_AND_RESET_METRICS)))
          .addMethod(
            getResetMetricsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_RESET_METRICS)))
          .addMethod(
            getGetMetricsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>(
                  this, METHODID_GET_METRICS)))
          .addMethod(
            getHealthCheckMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult>(
                  this, METHODID_HEALTH_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class InstanceControlStub extends io.grpc.stub.AbstractStub<InstanceControlStub> {
    private InstanceControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceControlStub(channel, callOptions);
    }

    /**
     */
    public void getFunctionStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFunctionStatusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAndResetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAndResetMetricsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetMetricsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void healthCheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InstanceControlBlockingStub extends io.grpc.stub.AbstractStub<InstanceControlBlockingStub> {
    private InstanceControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus getFunctionStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetFunctionStatusMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData getAndResetMetrics(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAndResetMetricsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resetMetrics(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getResetMetricsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData getMetrics(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMetricsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult healthCheck(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getHealthCheckMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InstanceControlFutureStub extends io.grpc.stub.AbstractStub<InstanceControlFutureStub> {
    private InstanceControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus> getFunctionStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFunctionStatusMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getAndResetMetrics(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAndResetMetricsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetMetrics(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getResetMetricsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData> getMetrics(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMetricsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult> healthCheck(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthCheckMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FUNCTION_STATUS = 0;
  private static final int METHODID_GET_AND_RESET_METRICS = 1;
  private static final int METHODID_RESET_METRICS = 2;
  private static final int METHODID_GET_METRICS = 3;
  private static final int METHODID_HEALTH_CHECK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FUNCTION_STATUS:
          serviceImpl.getFunctionStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.FunctionStatus>) responseObserver);
          break;
        case METHODID_GET_AND_RESET_METRICS:
          serviceImpl.getAndResetMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>) responseObserver);
          break;
        case METHODID_RESET_METRICS:
          serviceImpl.resetMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.MetricsData>) responseObserver);
          break;
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.pulsar.functions.proto.InstanceCommunication.HealthCheckResult>) responseObserver);
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

  private static abstract class InstanceControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.pulsar.functions.proto.InstanceCommunication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceControl");
    }
  }

  private static final class InstanceControlFileDescriptorSupplier
      extends InstanceControlBaseDescriptorSupplier {
    InstanceControlFileDescriptorSupplier() {}
  }

  private static final class InstanceControlMethodDescriptorSupplier
      extends InstanceControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceControlFileDescriptorSupplier())
              .addMethod(getGetFunctionStatusMethodHelper())
              .addMethod(getGetAndResetMetricsMethodHelper())
              .addMethod(getResetMetricsMethodHelper())
              .addMethod(getGetMetricsMethodHelper())
              .addMethod(getHealthCheckMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
