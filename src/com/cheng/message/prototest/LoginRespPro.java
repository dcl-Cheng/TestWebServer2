// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test/LoginResp.proto

package com.cheng.message.prototest;

public final class LoginRespPro {
  private LoginRespPro() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LoginRespOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .proto.PlayerMsg player = 1;
    boolean hasPlayer();
    PlayerMsgPro.PlayerMsg getPlayer();
    PlayerMsgPro.PlayerMsgOrBuilder getPlayerOrBuilder();
    
    // optional .proto.StatusCode status = 2;
    boolean hasStatus();
    LoginRespPro.StatusCode getStatus();
    LoginRespPro.StatusCodeOrBuilder getStatusOrBuilder();
  }
  public static final class LoginResp extends
      com.google.protobuf.GeneratedMessage
      implements LoginRespOrBuilder {
    // Use LoginResp.newBuilder() to construct.
    private LoginResp(Builder builder) {
      super(builder);
    }
    private LoginResp(boolean noInit) {}
    
    private static final LoginResp defaultInstance;
    public static LoginResp getDefaultInstance() {
      return defaultInstance;
    }
    
    public LoginResp getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LoginRespPro.internal_static_proto_LoginResp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LoginRespPro.internal_static_proto_LoginResp_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional .proto.PlayerMsg player = 1;
    public static final int PLAYER_FIELD_NUMBER = 1;
    private PlayerMsgPro.PlayerMsg player_;
    public boolean hasPlayer() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public PlayerMsgPro.PlayerMsg getPlayer() {
      return player_;
    }
    public PlayerMsgPro.PlayerMsgOrBuilder getPlayerOrBuilder() {
      return player_;
    }
    
    // optional .proto.StatusCode status = 2;
    public static final int STATUS_FIELD_NUMBER = 2;
    private LoginRespPro.StatusCode status_;
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public LoginRespPro.StatusCode getStatus() {
      return status_;
    }
    public LoginRespPro.StatusCodeOrBuilder getStatusOrBuilder() {
      return status_;
    }
    
    private void initFields() {
      player_ = PlayerMsgPro.PlayerMsg.getDefaultInstance();
      status_ = LoginRespPro.StatusCode.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, player_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, status_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, player_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, status_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static LoginRespPro.LoginResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static LoginRespPro.LoginResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static LoginRespPro.LoginResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static LoginRespPro.LoginResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static LoginRespPro.LoginResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static LoginRespPro.LoginResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static LoginRespPro.LoginResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static LoginRespPro.LoginResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static LoginRespPro.LoginResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static LoginRespPro.LoginResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(LoginRespPro.LoginResp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements LoginRespPro.LoginRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LoginRespPro.internal_static_proto_LoginResp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LoginRespPro.internal_static_proto_LoginResp_fieldAccessorTable;
      }
      
      // Construct using LoginRespPro.LoginResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPlayerFieldBuilder();
          getStatusFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (playerBuilder_ == null) {
          player_ = PlayerMsgPro.PlayerMsg.getDefaultInstance();
        } else {
          playerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statusBuilder_ == null) {
          status_ = LoginRespPro.StatusCode.getDefaultInstance();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LoginRespPro.LoginResp.getDescriptor();
      }
      
      public LoginRespPro.LoginResp getDefaultInstanceForType() {
        return LoginRespPro.LoginResp.getDefaultInstance();
      }
      
      public LoginRespPro.LoginResp build() {
        LoginRespPro.LoginResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private LoginRespPro.LoginResp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        LoginRespPro.LoginResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public LoginRespPro.LoginResp buildPartial() {
        LoginRespPro.LoginResp result = new LoginRespPro.LoginResp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (playerBuilder_ == null) {
          result.player_ = player_;
        } else {
          result.player_ = playerBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LoginRespPro.LoginResp) {
          return mergeFrom((LoginRespPro.LoginResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(LoginRespPro.LoginResp other) {
        if (other == LoginRespPro.LoginResp.getDefaultInstance()) return this;
        if (other.hasPlayer()) {
          mergePlayer(other.getPlayer());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              PlayerMsgPro.PlayerMsg.Builder subBuilder = PlayerMsgPro.PlayerMsg.newBuilder();
              if (hasPlayer()) {
                subBuilder.mergeFrom(getPlayer());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setPlayer(subBuilder.buildPartial());
              break;
            }
            case 18: {
              LoginRespPro.StatusCode.Builder subBuilder = LoginRespPro.StatusCode.newBuilder();
              if (hasStatus()) {
                subBuilder.mergeFrom(getStatus());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setStatus(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .proto.PlayerMsg player = 1;
      private PlayerMsgPro.PlayerMsg player_ = PlayerMsgPro.PlayerMsg.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          PlayerMsgPro.PlayerMsg, PlayerMsgPro.PlayerMsg.Builder, PlayerMsgPro.PlayerMsgOrBuilder> playerBuilder_;
      public boolean hasPlayer() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public PlayerMsgPro.PlayerMsg getPlayer() {
        if (playerBuilder_ == null) {
          return player_;
        } else {
          return playerBuilder_.getMessage();
        }
      }
      public Builder setPlayer(PlayerMsgPro.PlayerMsg value) {
        if (playerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          player_ = value;
          onChanged();
        } else {
          playerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setPlayer(
          PlayerMsgPro.PlayerMsg.Builder builderForValue) {
        if (playerBuilder_ == null) {
          player_ = builderForValue.build();
          onChanged();
        } else {
          playerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergePlayer(PlayerMsgPro.PlayerMsg value) {
        if (playerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              player_ != PlayerMsgPro.PlayerMsg.getDefaultInstance()) {
            player_ =
              PlayerMsgPro.PlayerMsg.newBuilder(player_).mergeFrom(value).buildPartial();
          } else {
            player_ = value;
          }
          onChanged();
        } else {
          playerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearPlayer() {
        if (playerBuilder_ == null) {
          player_ = PlayerMsgPro.PlayerMsg.getDefaultInstance();
          onChanged();
        } else {
          playerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public PlayerMsgPro.PlayerMsg.Builder getPlayerBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPlayerFieldBuilder().getBuilder();
      }
      public PlayerMsgPro.PlayerMsgOrBuilder getPlayerOrBuilder() {
        if (playerBuilder_ != null) {
          return playerBuilder_.getMessageOrBuilder();
        } else {
          return player_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          PlayerMsgPro.PlayerMsg, PlayerMsgPro.PlayerMsg.Builder, PlayerMsgPro.PlayerMsgOrBuilder>
          getPlayerFieldBuilder() {
        if (playerBuilder_ == null) {
          playerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              PlayerMsgPro.PlayerMsg, PlayerMsgPro.PlayerMsg.Builder, PlayerMsgPro.PlayerMsgOrBuilder>(
                  player_,
                  getParentForChildren(),
                  isClean());
          player_ = null;
        }
        return playerBuilder_;
      }
      
      // optional .proto.StatusCode status = 2;
      private LoginRespPro.StatusCode status_ = LoginRespPro.StatusCode.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          LoginRespPro.StatusCode, LoginRespPro.StatusCode.Builder, LoginRespPro.StatusCodeOrBuilder> statusBuilder_;
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public LoginRespPro.StatusCode getStatus() {
        if (statusBuilder_ == null) {
          return status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      public Builder setStatus(LoginRespPro.StatusCode value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setStatus(
          LoginRespPro.StatusCode.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeStatus(LoginRespPro.StatusCode value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              status_ != LoginRespPro.StatusCode.getDefaultInstance()) {
            status_ =
              LoginRespPro.StatusCode.newBuilder(status_).mergeFrom(value).buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = LoginRespPro.StatusCode.getDefaultInstance();
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public LoginRespPro.StatusCode.Builder getStatusBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      public LoginRespPro.StatusCodeOrBuilder getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          LoginRespPro.StatusCode, LoginRespPro.StatusCode.Builder, LoginRespPro.StatusCodeOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              LoginRespPro.StatusCode, LoginRespPro.StatusCode.Builder, LoginRespPro.StatusCodeOrBuilder>(
                  status_,
                  getParentForChildren(),
                  isClean());
          status_ = null;
        }
        return statusBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.LoginResp)
    }
    
    static {
      defaultInstance = new LoginResp(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.LoginResp)
  }
  
  public interface StatusCodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 status = 1;
    boolean hasStatus();
    int getStatus();
    
    // optional string tip = 2;
    boolean hasTip();
    String getTip();
  }
  public static final class StatusCode extends
      com.google.protobuf.GeneratedMessage
      implements StatusCodeOrBuilder {
    // Use StatusCode.newBuilder() to construct.
    private StatusCode(Builder builder) {
      super(builder);
    }
    private StatusCode(boolean noInit) {}
    
    private static final StatusCode defaultInstance;
    public static StatusCode getDefaultInstance() {
      return defaultInstance;
    }
    
    public StatusCode getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LoginRespPro.internal_static_proto_StatusCode_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LoginRespPro.internal_static_proto_StatusCode_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStatus() {
      return status_;
    }
    
    // optional string tip = 2;
    public static final int TIP_FIELD_NUMBER = 2;
    private java.lang.Object tip_;
    public boolean hasTip() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getTip() {
      java.lang.Object ref = tip_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          tip_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTipBytes() {
      java.lang.Object ref = tip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        tip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      status_ = 0;
      tip_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTipBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTipBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static LoginRespPro.StatusCode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static LoginRespPro.StatusCode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static LoginRespPro.StatusCode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static LoginRespPro.StatusCode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static LoginRespPro.StatusCode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static LoginRespPro.StatusCode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static LoginRespPro.StatusCode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static LoginRespPro.StatusCode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static LoginRespPro.StatusCode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static LoginRespPro.StatusCode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(LoginRespPro.StatusCode prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements LoginRespPro.StatusCodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LoginRespPro.internal_static_proto_StatusCode_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LoginRespPro.internal_static_proto_StatusCode_fieldAccessorTable;
      }
      
      // Construct using LoginRespPro.StatusCode.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        tip_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LoginRespPro.StatusCode.getDescriptor();
      }
      
      public LoginRespPro.StatusCode getDefaultInstanceForType() {
        return LoginRespPro.StatusCode.getDefaultInstance();
      }
      
      public LoginRespPro.StatusCode build() {
        LoginRespPro.StatusCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private LoginRespPro.StatusCode buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        LoginRespPro.StatusCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public LoginRespPro.StatusCode buildPartial() {
        LoginRespPro.StatusCode result = new LoginRespPro.StatusCode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.tip_ = tip_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LoginRespPro.StatusCode) {
          return mergeFrom((LoginRespPro.StatusCode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(LoginRespPro.StatusCode other) {
        if (other == LoginRespPro.StatusCode.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasTip()) {
          setTip(other.getTip());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              tip_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 status = 1;
      private int status_ ;
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStatus() {
        return status_;
      }
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }
      
      // optional string tip = 2;
      private java.lang.Object tip_ = "";
      public boolean hasTip() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getTip() {
        java.lang.Object ref = tip_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          tip_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTip(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        tip_ = value;
        onChanged();
        return this;
      }
      public Builder clearTip() {
        bitField0_ = (bitField0_ & ~0x00000002);
        tip_ = getDefaultInstance().getTip();
        onChanged();
        return this;
      }
      void setTip(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        tip_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:proto.StatusCode)
    }
    
    static {
      defaultInstance = new StatusCode(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.StatusCode)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_LoginResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_LoginResp_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_StatusCode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_StatusCode_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024test/LoginResp.proto\022\005proto\032\024test/Play" +
      "erMsg.proto\"P\n\tLoginResp\022 \n\006player\030\001 \001(\013" +
      "2\020.proto.PlayerMsg\022!\n\006status\030\002 \001(\0132\021.pro" +
      "to.StatusCode\")\n\nStatusCode\022\016\n\006status\030\001 " +
      "\001(\005\022\013\n\003tip\030\002 \001(\tB+\n\033com.cheng.message.pr" +
      "ototestB\014LoginRespPro"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_LoginResp_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_LoginResp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_LoginResp_descriptor,
              new java.lang.String[] { "Player", "Status", },
              LoginRespPro.LoginResp.class,
              LoginRespPro.LoginResp.Builder.class);
          internal_static_proto_StatusCode_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_proto_StatusCode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_StatusCode_descriptor,
              new java.lang.String[] { "Status", "Tip", },
              LoginRespPro.StatusCode.class,
              LoginRespPro.StatusCode.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          PlayerMsgPro.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}