package xyz.pubps.artinus.application.port.in;

import xyz.pubps.artinus.adapter.out.persistence.entity.ChannelType;

public record SubscriptionCommand(
    String phoneNumber,
    String channelId,
    ChannelType subscriptionType
) {

}
