// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public final class ResourcesProto {
  private ResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_Device_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceRegistry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_MqttConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_HttpConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_HttpConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_StateNotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_RegistryCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_RegistryCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_X509CertificateDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_DeviceCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_DeviceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_iot_v1_DeviceState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/iot/v1/resources.proto\022\023g" +
      "oogle.cloud.iot.v1\032\034google/api/annotatio" +
      "ns.proto\032\037google/protobuf/timestamp.prot" +
      "o\032\027google/rpc/status.proto\"\315\005\n\006Device\022\n\n" +
      "\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006num_id\030\003 \001(\004\022" +
      ":\n\013credentials\030\014 \003(\0132%.google.cloud.iot." +
      "v1.DeviceCredential\0227\n\023last_heartbeat_ti" +
      "me\030\007 \001(\0132\032.google.protobuf.Timestamp\0223\n\017" +
      "last_event_time\030\010 \001(\0132\032.google.protobuf." +
      "Timestamp\0223\n\017last_state_time\030\024 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\0228\n\024last_config_ac" +
      "k_time\030\016 \001(\0132\032.google.protobuf.Timestamp" +
      "\0229\n\025last_config_send_time\030\022 \001(\0132\032.google" +
      ".protobuf.Timestamp\022\017\n\007blocked\030\023 \001(\010\0223\n\017" +
      "last_error_time\030\n \001(\0132\032.google.protobuf." +
      "Timestamp\022-\n\021last_error_status\030\013 \001(\0132\022.g" +
      "oogle.rpc.Status\0221\n\006config\030\r \001(\0132!.googl" +
      "e.cloud.iot.v1.DeviceConfig\022/\n\005state\030\020 \001" +
      "(\0132 .google.cloud.iot.v1.DeviceState\022;\n\010" +
      "metadata\030\021 \003(\0132).google.cloud.iot.v1.Dev" +
      "ice.MetadataEntry\032/\n\rMetadataEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\367\002\n\016DeviceReg" +
      "istry\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022P\n\032event" +
      "_notification_configs\030\n \003(\0132,.google.clo" +
      "ud.iot.v1.EventNotificationConfig\022O\n\031sta" +
      "te_notification_config\030\007 \001(\0132,.google.cl" +
      "oud.iot.v1.StateNotificationConfig\0224\n\013mq" +
      "tt_config\030\004 \001(\0132\037.google.cloud.iot.v1.Mq" +
      "ttConfig\0224\n\013http_config\030\t \001(\0132\037.google.c" +
      "loud.iot.v1.HttpConfig\022<\n\013credentials\030\010 " +
      "\003(\0132\'.google.cloud.iot.v1.RegistryCreden" +
      "tial\"H\n\nMqttConfig\022:\n\022mqtt_enabled_state" +
      "\030\001 \001(\0162\036.google.cloud.iot.v1.MqttState\"H" +
      "\n\nHttpConfig\022:\n\022http_enabled_state\030\001 \001(\016" +
      "2\036.google.cloud.iot.v1.HttpState\"O\n\027Even" +
      "tNotificationConfig\022\031\n\021subfolder_matches" +
      "\030\002 \001(\t\022\031\n\021pubsub_topic_name\030\001 \001(\t\"4\n\027Sta" +
      "teNotificationConfig\022\031\n\021pubsub_topic_nam" +
      "e\030\001 \001(\t\"o\n\022RegistryCredential\022K\n\026public_" +
      "key_certificate\030\001 \001(\0132).google.cloud.iot" +
      ".v1.PublicKeyCertificateH\000B\014\n\ncredential" +
      "\"\320\001\n\026X509CertificateDetails\022\016\n\006issuer\030\001 " +
      "\001(\t\022\017\n\007subject\030\002 \001(\t\022.\n\nstart_time\030\003 \001(\013" +
      "2\032.google.protobuf.Timestamp\022/\n\013expiry_t" +
      "ime\030\004 \001(\0132\032.google.protobuf.Timestamp\022\033\n" +
      "\023signature_algorithm\030\005 \001(\t\022\027\n\017public_key" +
      "_type\030\006 \001(\t\"\257\001\n\024PublicKeyCertificate\022?\n\006" +
      "format\030\001 \001(\0162/.google.cloud.iot.v1.Publi" +
      "cKeyCertificateFormat\022\023\n\013certificate\030\002 \001" +
      "(\t\022A\n\014x509_details\030\003 \001(\0132+.google.cloud." +
      "iot.v1.X509CertificateDetails\"\225\001\n\020Device" +
      "Credential\022>\n\npublic_key\030\002 \001(\0132(.google." +
      "cloud.iot.v1.PublicKeyCredentialH\000\0223\n\017ex" +
      "piration_time\030\006 \001(\0132\032.google.protobuf.Ti" +
      "mestampB\014\n\ncredential\"X\n\023PublicKeyCreden" +
      "tial\0224\n\006format\030\001 \001(\0162$.google.cloud.iot." +
      "v1.PublicKeyFormat\022\013\n\003key\030\002 \001(\t\"\240\001\n\014Devi" +
      "ceConfig\022\017\n\007version\030\001 \001(\003\0225\n\021cloud_updat" +
      "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "\0223\n\017device_ack_time\030\003 \001(\0132\032.google.proto" +
      "buf.Timestamp\022\023\n\013binary_data\030\004 \001(\014\"S\n\013De" +
      "viceState\022/\n\013update_time\030\001 \001(\0132\032.google." +
      "protobuf.Timestamp\022\023\n\013binary_data\030\002 \001(\014*" +
      "L\n\tMqttState\022\032\n\026MQTT_STATE_UNSPECIFIED\020\000" +
      "\022\020\n\014MQTT_ENABLED\020\001\022\021\n\rMQTT_DISABLED\020\002*L\n" +
      "\tHttpState\022\032\n\026HTTP_STATE_UNSPECIFIED\020\000\022\020" +
      "\n\014HTTP_ENABLED\020\001\022\021\n\rHTTP_DISABLED\020\002*e\n\032P" +
      "ublicKeyCertificateFormat\022-\n)UNSPECIFIED" +
      "_PUBLIC_KEY_CERTIFICATE_FORMAT\020\000\022\030\n\024X509" +
      "_CERTIFICATE_PEM\020\001*v\n\017PublicKeyFormat\022!\n" +
      "\035UNSPECIFIED_PUBLIC_KEY_FORMAT\020\000\022\013\n\007RSA_" +
      "PEM\020\003\022\020\n\014RSA_X509_PEM\020\001\022\r\n\tES256_PEM\020\002\022\022" +
      "\n\016ES256_X509_PEM\020\004Bf\n\027com.google.cloud.i" +
      "ot.v1B\016ResourcesProtoP\001Z6google.golang.o" +
      "rg/genproto/googleapis/cloud/iot/v1;iot\370" +
      "\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_iot_v1_Device_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_iot_v1_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_Device_descriptor,
        new java.lang.String[] { "Id", "Name", "NumId", "Credentials", "LastHeartbeatTime", "LastEventTime", "LastStateTime", "LastConfigAckTime", "LastConfigSendTime", "Blocked", "LastErrorTime", "LastErrorStatus", "Config", "State", "Metadata", });
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor =
      internal_static_google_cloud_iot_v1_Device_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_iot_v1_DeviceRegistry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor,
        new java.lang.String[] { "Id", "Name", "EventNotificationConfigs", "StateNotificationConfig", "MqttConfig", "HttpConfig", "Credentials", });
    internal_static_google_cloud_iot_v1_MqttConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_MqttConfig_descriptor,
        new java.lang.String[] { "MqttEnabledState", });
    internal_static_google_cloud_iot_v1_HttpConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_iot_v1_HttpConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_HttpConfig_descriptor,
        new java.lang.String[] { "HttpEnabledState", });
    internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor,
        new java.lang.String[] { "SubfolderMatches", "PubsubTopicName", });
    internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_iot_v1_StateNotificationConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor,
        new java.lang.String[] { "PubsubTopicName", });
    internal_static_google_cloud_iot_v1_RegistryCredential_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_iot_v1_RegistryCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_RegistryCredential_descriptor,
        new java.lang.String[] { "PublicKeyCertificate", "Credential", });
    internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_iot_v1_X509CertificateDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor,
        new java.lang.String[] { "Issuer", "Subject", "StartTime", "ExpiryTime", "SignatureAlgorithm", "PublicKeyType", });
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor,
        new java.lang.String[] { "Format", "Certificate", "X509Details", });
    internal_static_google_cloud_iot_v1_DeviceCredential_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_iot_v1_DeviceCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_DeviceCredential_descriptor,
        new java.lang.String[] { "PublicKey", "ExpirationTime", "Credential", });
    internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor,
        new java.lang.String[] { "Format", "Key", });
    internal_static_google_cloud_iot_v1_DeviceConfig_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_iot_v1_DeviceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_DeviceConfig_descriptor,
        new java.lang.String[] { "Version", "CloudUpdateTime", "DeviceAckTime", "BinaryData", });
    internal_static_google_cloud_iot_v1_DeviceState_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_iot_v1_DeviceState_descriptor,
        new java.lang.String[] { "UpdateTime", "BinaryData", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
