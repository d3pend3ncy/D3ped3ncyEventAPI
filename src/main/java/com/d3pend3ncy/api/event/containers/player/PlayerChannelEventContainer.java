package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerChannelEventInterface;
import org.bukkit.event.player.PlayerChannelEvent;

public class PlayerChannelEventContainer extends ContainerEvent<PlayerChannelEventInterface, PlayerChannelEvent> {

    public PlayerChannelEventContainer(PlayerChannelEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerChannelEventInterface listener, PlayerChannelEvent event) {
        listener.onPlayerChannelEvent(event);
    }

    @Override
    public Class<PlayerChannelEventInterface> getListenerType() {
        return PlayerChannelEventInterface.class;
    }
}
