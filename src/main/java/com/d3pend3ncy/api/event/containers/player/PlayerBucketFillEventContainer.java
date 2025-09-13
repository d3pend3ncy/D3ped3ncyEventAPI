package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerBucketFillEventInterface;
import org.bukkit.event.player.PlayerBucketFillEvent;

public class PlayerBucketFillEventContainer extends ContainerEvent<PlayerBucketFillEventInterface, PlayerBucketFillEvent> {

    public PlayerBucketFillEventContainer(PlayerBucketFillEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerBucketFillEventInterface listener, PlayerBucketFillEvent event) {
        listener.onPlayerBucketFillEvent(event);
    }

    @Override
    public Class<PlayerBucketFillEventInterface> getListenerType() {
        return PlayerBucketFillEventInterface.class;
    }
}
