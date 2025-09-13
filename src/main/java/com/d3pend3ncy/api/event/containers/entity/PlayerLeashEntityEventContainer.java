package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.PlayerLeashEntityEventInterface;
import org.bukkit.event.entity.PlayerLeashEntityEvent;

public class PlayerLeashEntityEventContainer extends ContainerEvent<PlayerLeashEntityEventInterface, PlayerLeashEntityEvent> {

    public PlayerLeashEntityEventContainer(PlayerLeashEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerLeashEntityEventInterface listener, PlayerLeashEntityEvent event) {
        listener.onPlayerLeashEntityEvent(event);
    }

    @Override
    public Class<PlayerLeashEntityEventInterface> getListenerType() {
        return PlayerLeashEntityEventInterface.class;
    }
}
