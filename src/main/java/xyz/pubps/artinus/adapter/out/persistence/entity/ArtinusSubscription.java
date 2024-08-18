package xyz.pubps.artinus.adapter.out.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArtinusSubscription {
  private String phoneNumber;
  private String channelId;
  private ChannelType channelType;

}
