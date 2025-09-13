package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerBucketEmptyEventInterface;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class PlayerBucketEmptyEventContainer extends ContainerEvent<PlayerBucketEmptyEventInterface, PlayerBucketEmptyEvent> {

    public PlayerBucketEmptyEventContainer(PlayerBucketEmptyEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerBucketEmptyEventInterface listener, PlayerBucketEmptyEvent event) {
        listener.onPlayerBucketEmptyEvent(event);
    }

    @Override
    public Class<PlayerBucketEmptyEventInterface> getListenerType() {
        return PlayerBucketEmptyEventInterface.class;
    }
}
