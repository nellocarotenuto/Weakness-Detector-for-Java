// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestProcedure.proto

package org.apache.hadoop.hbase.shaded.ipc.protobuf.generated;

@javax.annotation.Generated("proto") public final class TestProcedureProtos {
  private TestProcedureProtos() {}
  public static void registerAllExtensions(
      org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestTableDDLStateDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestTableDDLStateData)
      org.apache.hbase.thirdparty.com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string table_name = 1;</code>
     */
    boolean hasTableName();
    /**
     * <code>required string table_name = 1;</code>
     */
    java.lang.String getTableName();
    /**
     * <code>required string table_name = 1;</code>
     */
    org.apache.hbase.thirdparty.com.google.protobuf.ByteString
        getTableNameBytes();
  }
  /**
   * Protobuf type {@code TestTableDDLStateData}
   */
  @javax.annotation.Generated("proto") public  static final class TestTableDDLStateData extends
      org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TestTableDDLStateData)
      TestTableDDLStateDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestTableDDLStateData.newBuilder() to construct.
    private TestTableDDLStateData(org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestTableDDLStateData() {
      tableName_ = "";
    }

    @java.lang.Override
    public final org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestTableDDLStateData(
        org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              org.apache.hbase.thirdparty.com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              tableName_ = bs;
              break;
            }
          }
        }
      } catch (org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_descriptor;
    }

    protected org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.class, org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.Builder.class);
    }

    private int bitField0_;
    public static final int TABLE_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object tableName_;
    /**
     * <code>required string table_name = 1;</code>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string table_name = 1;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hbase.thirdparty.com.google.protobuf.ByteString bs = 
            (org.apache.hbase.thirdparty.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string table_name = 1;</code>
     */
    public org.apache.hbase.thirdparty.com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof java.lang.String) {
        org.apache.hbase.thirdparty.com.google.protobuf.ByteString b = 
            org.apache.hbase.thirdparty.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (org.apache.hbase.thirdparty.com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTableName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(org.apache.hbase.thirdparty.com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData other = (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData) obj;

      boolean result = true;
      result = result && (hasTableName() == other.hasTableName());
      if (hasTableName()) {
        result = result && getTableName()
            .equals(other.getTableName());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTableName()) {
        hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getTableName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.ByteString data)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.ByteString data,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(byte[] data)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        byte[] data,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        java.io.InputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestTableDDLStateData}
     */
    @javax.annotation.Generated("proto") public static final class Builder extends
        org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TestTableDDLStateData)
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateDataOrBuilder {
      public static final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_descriptor;
      }

      protected org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.class, org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        tableName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_descriptor;
      }

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData build() {
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData buildPartial() {
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData result = new org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tableName_ = tableName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(org.apache.hbase.thirdparty.com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData) {
          return mergeFrom((org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData other) {
        if (other == org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.getDefaultInstance()) return this;
        if (other.hasTableName()) {
          bitField0_ |= 0x00000001;
          tableName_ = other.tableName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTableName()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
          org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object tableName_ = "";
      /**
       * <code>required string table_name = 1;</code>
       */
      public boolean hasTableName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public java.lang.String getTableName() {
        java.lang.Object ref = tableName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hbase.thirdparty.com.google.protobuf.ByteString bs =
              (org.apache.hbase.thirdparty.com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tableName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public org.apache.hbase.thirdparty.com.google.protobuf.ByteString
          getTableNameBytes() {
        java.lang.Object ref = tableName_;
        if (ref instanceof String) {
          org.apache.hbase.thirdparty.com.google.protobuf.ByteString b = 
              org.apache.hbase.thirdparty.com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tableName_ = b;
          return b;
        } else {
          return (org.apache.hbase.thirdparty.com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public Builder setTableName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tableName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public Builder clearTableName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tableName_ = getDefaultInstance().getTableName();
        onChanged();
        return this;
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public Builder setTableNameBytes(
          org.apache.hbase.thirdparty.com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tableName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TestTableDDLStateData)
    }

    // @@protoc_insertion_point(class_scope:TestTableDDLStateData)
    private static final org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData();
    }

    public static org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hbase.thirdparty.com.google.protobuf.Parser<TestTableDDLStateData>
        PARSER = new org.apache.hbase.thirdparty.com.google.protobuf.AbstractParser<TestTableDDLStateData>() {
      public TestTableDDLStateData parsePartialFrom(
          org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
          org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
        return new TestTableDDLStateData(input, extensionRegistry);
      }
    };

    public static org.apache.hbase.thirdparty.com.google.protobuf.Parser<TestTableDDLStateData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hbase.thirdparty.com.google.protobuf.Parser<TestTableDDLStateData> getParserForType() {
      return PARSER;
    }

    public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
    internal_static_TestTableDDLStateData_descriptor;
  private static final 
    org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestTableDDLStateData_fieldAccessorTable;

  public static org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TestProcedure.proto\"+\n\025TestTableDDLSta" +
      "teData\022\022\n\ntable_name\030\001 \002(\tBO\n5org.apache" +
      ".hadoop.hbase.shaded.ipc.protobuf.genera" +
      "tedB\023TestProcedureProtos\210\001\001"
    };
    org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_TestTableDDLStateData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestTableDDLStateData_fieldAccessorTable = new
      org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestTableDDLStateData_descriptor,
        new java.lang.String[] { "TableName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}