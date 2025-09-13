package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerVelocityEventInterface;
import org.bukkit.event.player.PlayerVelocityEvent;

public class PlayerVelocityEventContainer extends ContainerEvent<PlayerVelocityEventInterface, PlayerVelocityEvent> {

    public PlayerVelocityEventContainer(PlayerVelocityEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerVelocityEventInterface listener, PlayerVelocityEvent event) {
        listener.onPlayerVelocityEvent(event);
    }

    @Override
    public Class<PlayerVelocityEventInterface> getListenerType() {
        return PlayerVelocityEventInterface.class;
    }
}
