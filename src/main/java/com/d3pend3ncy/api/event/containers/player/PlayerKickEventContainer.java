package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerKickEventInterface;
import org.bukkit.event.player.PlayerKickEvent;

public class PlayerKickEventContainer extends ContainerEvent<PlayerKickEventInterface, PlayerKickEvent> {

    public PlayerKickEventContainer(PlayerKickEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerKickEventInterface listener, PlayerKickEvent event) {
        listener.onPlayerKickEvent(event);
    }

    @Override
    public Class<PlayerKickEventInterface> getListenerType() {
        return PlayerKickEventInterface.class;
    }
}
