// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_bitnode.proto

package bdcc.grpc;

public interface NodeNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.NodeNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string user_address = 2;</code>
   * @return The userAddress.
   */
  java.lang.String getUserAddress();
  /**
   * <code>string user_address = 2;</code>
   * @return The bytes for userAddress.
   */
  com.google.protobuf.ByteString
      getUserAddressBytes();

  /**
   * <code>string public_key = 3;</code>
   * @return The publicKey.
   */
  java.lang.String getPublicKey();
  /**
   * <code>string public_key = 3;</code>
   * @return The bytes for publicKey.
   */
  com.google.protobuf.ByteString
      getPublicKeyBytes();

  /**
   * <code>string auction_id = 4;</code>
   * @return The auctionId.
   */
  java.lang.String getAuctionId();
  /**
   * <code>string auction_id = 4;</code>
   * @return The bytes for auctionId.
   */
  com.google.protobuf.ByteString
      getAuctionIdBytes();

  /**
   * <code>string item = 5;</code>
   * @return The item.
   */
  java.lang.String getItem();
  /**
   * <code>string item = 5;</code>
   * @return The bytes for item.
   */
  com.google.protobuf.ByteString
      getItemBytes();

  /**
   * <code>string max_bid = 6;</code>
   * @return The maxBid.
   */
  java.lang.String getMaxBid();
  /**
   * <code>string max_bid = 6;</code>
   * @return The bytes for maxBid.
   */
  com.google.protobuf.ByteString
      getMaxBidBytes();

  /**
   * <code>string random_auction_id = 7;</code>
   * @return The randomAuctionId.
   */
  java.lang.String getRandomAuctionId();
  /**
   * <code>string random_auction_id = 7;</code>
   * @return The bytes for randomAuctionId.
   */
  com.google.protobuf.ByteString
      getRandomAuctionIdBytes();

  /**
   * <code>string random_user_id = 8;</code>
   * @return The randomUserId.
   */
  java.lang.String getRandomUserId();
  /**
   * <code>string random_user_id = 8;</code>
   * @return The bytes for randomUserId.
   */
  com.google.protobuf.ByteString
      getRandomUserIdBytes();

  /**
   * <code>string random_item = 9;</code>
   * @return The randomItem.
   */
  java.lang.String getRandomItem();
  /**
   * <code>string random_item = 9;</code>
   * @return The bytes for randomItem.
   */
  com.google.protobuf.ByteString
      getRandomItemBytes();

  /**
   * <code>string random_max_bid = 10;</code>
   * @return The randomMaxBid.
   */
  java.lang.String getRandomMaxBid();
  /**
   * <code>string random_max_bid = 10;</code>
   * @return The bytes for randomMaxBid.
   */
  com.google.protobuf.ByteString
      getRandomMaxBidBytes();
}