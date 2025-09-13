package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerRegisterChannelEventInterface;
import org.bukkit.event.player.PlayerRegisterChannelEvent;

public class PlayerRegisterChannelEventContainer extends ContainerEvent<PlayerRegisterChannelEventInterface, PlayerRegisterChannelEvent> {

    public PlayerRegisterChannelEventContainer(PlayerRegisterChannelEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerRegisterChannelEventInterface listener, PlayerRegisterChannelEvent event) {
        listener.onPlayerRegisterChannelEvent(event);
    }

    @Override
    public Class<PlayerRegisterChannelEventInterface> getListenerType() {
        return PlayerRegisterChannelEventInterface.class;
    }
}
