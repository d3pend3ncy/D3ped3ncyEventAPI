package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerUnregisterChannelEventInterface;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;

public class PlayerUnregisterChannelEventContainer extends ContainerEvent<PlayerUnregisterChannelEventInterface, PlayerUnregisterChannelEvent> {

    public PlayerUnregisterChannelEventContainer(PlayerUnregisterChannelEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerUnregisterChannelEventInterface listener, PlayerUnregisterChannelEvent event) {
        listener.onPlayerUnregisterChannelEvent(event);
    }

    @Override
    public Class<PlayerUnregisterChannelEventInterface> getListenerType() {
        return PlayerUnregisterChannelEventInterface.class;
    }
}
