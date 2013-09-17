// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entry.proto

package org.robotninjas.barge.rpc;

public final class RaftEntry {
  private RaftEntry() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EntryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 term = 1;
    /**
     * <code>required int64 term = 1;</code>
     */
    boolean hasTerm();
    /**
     * <code>required int64 term = 1;</code>
     */
    long getTerm();

    // required bytes command = 2;
    /**
     * <code>required bytes command = 2;</code>
     */
    boolean hasCommand();
    /**
     * <code>required bytes command = 2;</code>
     */
    com.google.protobuf.ByteString getCommand();
  }
  /**
   * Protobuf type {@code Entry}
   */
  public static final class Entry extends
      com.google.protobuf.GeneratedMessage
      implements EntryOrBuilder {
    // Use Entry.newBuilder() to construct.
    private Entry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Entry(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Entry defaultInstance;
    public static Entry getDefaultInstance() {
      return defaultInstance;
    }

    public Entry getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Entry(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              term_ = input.readInt64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              command_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.robotninjas.barge.rpc.RaftEntry.internal_static_Entry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robotninjas.barge.rpc.RaftEntry.internal_static_Entry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robotninjas.barge.rpc.RaftEntry.Entry.class, org.robotninjas.barge.rpc.RaftEntry.Entry.Builder.class);
    }

    public static com.google.protobuf.Parser<Entry> PARSER =
        new com.google.protobuf.AbstractParser<Entry>() {
      public Entry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Entry(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Entry> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 term = 1;
    public static final int TERM_FIELD_NUMBER = 1;
    private long term_;
    /**
     * <code>required int64 term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }

    // required bytes command = 2;
    public static final int COMMAND_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString command_;
    /**
     * <code>required bytes command = 2;</code>
     */
    public boolean hasCommand() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bytes command = 2;</code>
     */
    public com.google.protobuf.ByteString getCommand() {
      return command_;
    }

    private void initFields() {
      term_ = 0L;
      command_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCommand()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, command_);
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
          .computeInt64Size(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, command_);
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

    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robotninjas.barge.rpc.RaftEntry.Entry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robotninjas.barge.rpc.RaftEntry.Entry prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Entry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.robotninjas.barge.rpc.RaftEntry.EntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robotninjas.barge.rpc.RaftEntry.internal_static_Entry_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robotninjas.barge.rpc.RaftEntry.internal_static_Entry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robotninjas.barge.rpc.RaftEntry.Entry.class, org.robotninjas.barge.rpc.RaftEntry.Entry.Builder.class);
      }

      // Construct using org.robotninjas.barge.rpc.RaftEntry.Entry.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        command_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robotninjas.barge.rpc.RaftEntry.internal_static_Entry_descriptor;
      }

      public org.robotninjas.barge.rpc.RaftEntry.Entry getDefaultInstanceForType() {
        return org.robotninjas.barge.rpc.RaftEntry.Entry.getDefaultInstance();
      }

      public org.robotninjas.barge.rpc.RaftEntry.Entry build() {
        org.robotninjas.barge.rpc.RaftEntry.Entry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.robotninjas.barge.rpc.RaftEntry.Entry buildPartial() {
        org.robotninjas.barge.rpc.RaftEntry.Entry result = new org.robotninjas.barge.rpc.RaftEntry.Entry(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.command_ = command_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robotninjas.barge.rpc.RaftEntry.Entry) {
          return mergeFrom((org.robotninjas.barge.rpc.RaftEntry.Entry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robotninjas.barge.rpc.RaftEntry.Entry other) {
        if (other == org.robotninjas.barge.rpc.RaftEntry.Entry.getDefaultInstance()) return this;
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasCommand()) {
          setCommand(other.getCommand());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTerm()) {
          
          return false;
        }
        if (!hasCommand()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robotninjas.barge.rpc.RaftEntry.Entry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robotninjas.barge.rpc.RaftEntry.Entry) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 term = 1;
      private long term_ ;
      /**
       * <code>required int64 term = 1;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 term = 1;</code>
       */
      public long getTerm() {
        return term_;
      }
      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000001;
        term_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        term_ = 0L;
        onChanged();
        return this;
      }

      // required bytes command = 2;
      private com.google.protobuf.ByteString command_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes command = 2;</code>
       */
      public boolean hasCommand() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bytes command = 2;</code>
       */
      public com.google.protobuf.ByteString getCommand() {
        return command_;
      }
      /**
       * <code>required bytes command = 2;</code>
       */
      public Builder setCommand(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        command_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes command = 2;</code>
       */
      public Builder clearCommand() {
        bitField0_ = (bitField0_ & ~0x00000002);
        command_ = getDefaultInstance().getCommand();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Entry)
    }

    static {
      defaultInstance = new Entry(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Entry)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Entry_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Entry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013entry.proto\"&\n\005Entry\022\014\n\004term\030\001 \002(\003\022\017\n\007" +
      "command\030\002 \002(\014B\'\n\032org.robotninjas.barge." +
      "rpcB\tRaftEntry"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Entry_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Entry_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Entry_descriptor,
              new java.lang.String[] { "Term", "Command", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
