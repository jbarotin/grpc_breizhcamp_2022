// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/hello.proto

package com.breizhcamp.grpc.protos;

/**
 * Protobuf type {@code breizhcamp.MessageBreizhcamp}
 */
public  final class MessageBreizhcamp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:breizhcamp.MessageBreizhcamp)
    MessageBreizhcampOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageBreizhcamp.newBuilder() to construct.
  private MessageBreizhcamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageBreizhcamp() {
    green_ = 0;
    it_ = "";
    isBeautifull_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageBreizhcamp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            green_ = input.readInt32();
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            it_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            isBeautifull_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.breizhcamp.grpc.protos.AddressBookProtos.internal_static_breizhcamp_MessageBreizhcamp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.breizhcamp.grpc.protos.AddressBookProtos.internal_static_breizhcamp_MessageBreizhcamp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.breizhcamp.grpc.protos.MessageBreizhcamp.class, com.breizhcamp.grpc.protos.MessageBreizhcamp.Builder.class);
  }

  private int bitField0_;
  public static final int GREEN_FIELD_NUMBER = 1;
  private int green_;
  /**
   * <code>required int32 green = 1;</code>
   */
  public boolean hasGreen() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int32 green = 1;</code>
   */
  public int getGreen() {
    return green_;
  }

  public static final int IT_FIELD_NUMBER = 2;
  private volatile java.lang.Object it_;
  /**
   * <code>required string it = 2;</code>
   */
  public boolean hasIt() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required string it = 2;</code>
   */
  public java.lang.String getIt() {
    java.lang.Object ref = it_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        it_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string it = 2;</code>
   */
  public com.google.protobuf.ByteString
      getItBytes() {
    java.lang.Object ref = it_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      it_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISBEAUTIFULL_FIELD_NUMBER = 3;
  private int isBeautifull_;
  /**
   * <code>required int32 isBeautifull = 3;</code>
   */
  public boolean hasIsBeautifull() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required int32 isBeautifull = 3;</code>
   */
  public int getIsBeautifull() {
    return isBeautifull_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasGreen()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasIt()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasIsBeautifull()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, green_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, it_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, isBeautifull_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, green_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, it_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, isBeautifull_);
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
    if (!(obj instanceof com.breizhcamp.grpc.protos.MessageBreizhcamp)) {
      return super.equals(obj);
    }
    com.breizhcamp.grpc.protos.MessageBreizhcamp other = (com.breizhcamp.grpc.protos.MessageBreizhcamp) obj;

    boolean result = true;
    result = result && (hasGreen() == other.hasGreen());
    if (hasGreen()) {
      result = result && (getGreen()
          == other.getGreen());
    }
    result = result && (hasIt() == other.hasIt());
    if (hasIt()) {
      result = result && getIt()
          .equals(other.getIt());
    }
    result = result && (hasIsBeautifull() == other.hasIsBeautifull());
    if (hasIsBeautifull()) {
      result = result && (getIsBeautifull()
          == other.getIsBeautifull());
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
    if (hasGreen()) {
      hash = (37 * hash) + GREEN_FIELD_NUMBER;
      hash = (53 * hash) + getGreen();
    }
    if (hasIt()) {
      hash = (37 * hash) + IT_FIELD_NUMBER;
      hash = (53 * hash) + getIt().hashCode();
    }
    if (hasIsBeautifull()) {
      hash = (37 * hash) + ISBEAUTIFULL_FIELD_NUMBER;
      hash = (53 * hash) + getIsBeautifull();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.breizhcamp.grpc.protos.MessageBreizhcamp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.breizhcamp.grpc.protos.MessageBreizhcamp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code breizhcamp.MessageBreizhcamp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:breizhcamp.MessageBreizhcamp)
      com.breizhcamp.grpc.protos.MessageBreizhcampOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.breizhcamp.grpc.protos.AddressBookProtos.internal_static_breizhcamp_MessageBreizhcamp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.breizhcamp.grpc.protos.AddressBookProtos.internal_static_breizhcamp_MessageBreizhcamp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.breizhcamp.grpc.protos.MessageBreizhcamp.class, com.breizhcamp.grpc.protos.MessageBreizhcamp.Builder.class);
    }

    // Construct using com.breizhcamp.grpc.protos.MessageBreizhcamp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      green_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      it_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      isBeautifull_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.breizhcamp.grpc.protos.AddressBookProtos.internal_static_breizhcamp_MessageBreizhcamp_descriptor;
    }

    @java.lang.Override
    public com.breizhcamp.grpc.protos.MessageBreizhcamp getDefaultInstanceForType() {
      return com.breizhcamp.grpc.protos.MessageBreizhcamp.getDefaultInstance();
    }

    @java.lang.Override
    public com.breizhcamp.grpc.protos.MessageBreizhcamp build() {
      com.breizhcamp.grpc.protos.MessageBreizhcamp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.breizhcamp.grpc.protos.MessageBreizhcamp buildPartial() {
      com.breizhcamp.grpc.protos.MessageBreizhcamp result = new com.breizhcamp.grpc.protos.MessageBreizhcamp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.green_ = green_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.it_ = it_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.isBeautifull_ = isBeautifull_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.breizhcamp.grpc.protos.MessageBreizhcamp) {
        return mergeFrom((com.breizhcamp.grpc.protos.MessageBreizhcamp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.breizhcamp.grpc.protos.MessageBreizhcamp other) {
      if (other == com.breizhcamp.grpc.protos.MessageBreizhcamp.getDefaultInstance()) return this;
      if (other.hasGreen()) {
        setGreen(other.getGreen());
      }
      if (other.hasIt()) {
        bitField0_ |= 0x00000002;
        it_ = other.it_;
        onChanged();
      }
      if (other.hasIsBeautifull()) {
        setIsBeautifull(other.getIsBeautifull());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasGreen()) {
        return false;
      }
      if (!hasIt()) {
        return false;
      }
      if (!hasIsBeautifull()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.breizhcamp.grpc.protos.MessageBreizhcamp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.breizhcamp.grpc.protos.MessageBreizhcamp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int green_ ;
    /**
     * <code>required int32 green = 1;</code>
     */
    public boolean hasGreen() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 green = 1;</code>
     */
    public int getGreen() {
      return green_;
    }
    /**
     * <code>required int32 green = 1;</code>
     */
    public Builder setGreen(int value) {
      bitField0_ |= 0x00000001;
      green_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 green = 1;</code>
     */
    public Builder clearGreen() {
      bitField0_ = (bitField0_ & ~0x00000001);
      green_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object it_ = "";
    /**
     * <code>required string it = 2;</code>
     */
    public boolean hasIt() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string it = 2;</code>
     */
    public java.lang.String getIt() {
      java.lang.Object ref = it_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          it_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string it = 2;</code>
     */
    public com.google.protobuf.ByteString
        getItBytes() {
      java.lang.Object ref = it_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        it_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string it = 2;</code>
     */
    public Builder setIt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      it_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string it = 2;</code>
     */
    public Builder clearIt() {
      bitField0_ = (bitField0_ & ~0x00000002);
      it_ = getDefaultInstance().getIt();
      onChanged();
      return this;
    }
    /**
     * <code>required string it = 2;</code>
     */
    public Builder setItBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      it_ = value;
      onChanged();
      return this;
    }

    private int isBeautifull_ ;
    /**
     * <code>required int32 isBeautifull = 3;</code>
     */
    public boolean hasIsBeautifull() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 isBeautifull = 3;</code>
     */
    public int getIsBeautifull() {
      return isBeautifull_;
    }
    /**
     * <code>required int32 isBeautifull = 3;</code>
     */
    public Builder setIsBeautifull(int value) {
      bitField0_ |= 0x00000004;
      isBeautifull_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 isBeautifull = 3;</code>
     */
    public Builder clearIsBeautifull() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isBeautifull_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:breizhcamp.MessageBreizhcamp)
  }

  // @@protoc_insertion_point(class_scope:breizhcamp.MessageBreizhcamp)
  private static final com.breizhcamp.grpc.protos.MessageBreizhcamp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.breizhcamp.grpc.protos.MessageBreizhcamp();
  }

  public static com.breizhcamp.grpc.protos.MessageBreizhcamp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MessageBreizhcamp>
      PARSER = new com.google.protobuf.AbstractParser<MessageBreizhcamp>() {
    @java.lang.Override
    public MessageBreizhcamp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageBreizhcamp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageBreizhcamp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageBreizhcamp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.breizhcamp.grpc.protos.MessageBreizhcamp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
