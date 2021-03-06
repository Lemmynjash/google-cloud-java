// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

public interface PropertyOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.PropertyOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The property to order by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  boolean hasProperty();
  /**
   * <pre>
   * The property to order by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  com.google.datastore.v1.PropertyReference getProperty();
  /**
   * <pre>
   * The property to order by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  com.google.datastore.v1.PropertyReferenceOrBuilder getPropertyOrBuilder();

  /**
   * <pre>
   * The direction to order by. Defaults to `ASCENDING`.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyOrder.Direction direction = 2;</code>
   */
  int getDirectionValue();
  /**
   * <pre>
   * The direction to order by. Defaults to `ASCENDING`.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyOrder.Direction direction = 2;</code>
   */
  com.google.datastore.v1.PropertyOrder.Direction getDirection();
}
