// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Parts of the APIs which use certain infoTypes.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.InfoTypeSupportedBy}
 */
public enum InfoTypeSupportedBy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENUM_TYPE_UNSPECIFIED = 0;</code>
   */
  ENUM_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Supported by the inspect operations.
   * </pre>
   *
   * <code>INSPECT = 1;</code>
   */
  INSPECT(1),
  /**
   * <pre>
   * Supported by the risk analysis operations.
   * </pre>
   *
   * <code>RISK_ANALYSIS = 2;</code>
   */
  RISK_ANALYSIS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENUM_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ENUM_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Supported by the inspect operations.
   * </pre>
   *
   * <code>INSPECT = 1;</code>
   */
  public static final int INSPECT_VALUE = 1;
  /**
   * <pre>
   * Supported by the risk analysis operations.
   * </pre>
   *
   * <code>RISK_ANALYSIS = 2;</code>
   */
  public static final int RISK_ANALYSIS_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static InfoTypeSupportedBy valueOf(int value) {
    return forNumber(value);
  }

  public static InfoTypeSupportedBy forNumber(int value) {
    switch (value) {
      case 0: return ENUM_TYPE_UNSPECIFIED;
      case 1: return INSPECT;
      case 2: return RISK_ANALYSIS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InfoTypeSupportedBy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InfoTypeSupportedBy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InfoTypeSupportedBy>() {
          public InfoTypeSupportedBy findValueByNumber(int number) {
            return InfoTypeSupportedBy.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final InfoTypeSupportedBy[] VALUES = values();

  public static InfoTypeSupportedBy valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private InfoTypeSupportedBy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.InfoTypeSupportedBy)
}

