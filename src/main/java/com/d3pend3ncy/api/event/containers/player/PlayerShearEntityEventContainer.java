package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerShearEntityEventInterface;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class PlayerShearEntityEventContainer extends ContainerEvent<PlayerShearEntityEventInterface, PlayerShearEntityEvent> {

    public PlayerShearEntityEventContainer(PlayerShearEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerShearEntityEventInterface listener, PlayerShearEntityEvent event) {
        listener.onPlayerShearEntityEvent(event);
    }

    @Override
    public Class<PlayerShearEntityEventInterface> getListenerType() {
        return PlayerShearEntityEventInterface.class;
    }
}
