package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerCommandSendEventInterface;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class PlayerCommandSendEventContainer extends ContainerEvent<PlayerCommandSendEventInterface, PlayerCommandSendEvent> {

    public PlayerCommandSendEventContainer(PlayerCommandSendEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerCommandSendEventInterface listener, PlayerCommandSendEvent event) {
        listener.onPlayerCommandSendEvent(event);
    }

    @Override
    public Class<PlayerCommandSendEventInterface> getListenerType() {
        return PlayerCommandSendEventInterface.class;
    }
}
