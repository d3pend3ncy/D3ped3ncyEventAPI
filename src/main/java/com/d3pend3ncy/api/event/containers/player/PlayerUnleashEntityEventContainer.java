package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerUnleashEntityEventInterface;
import org.bukkit.event.player.PlayerUnleashEntityEvent;

public class PlayerUnleashEntityEventContainer extends ContainerEvent<PlayerUnleashEntityEventInterface, PlayerUnleashEntityEvent> {

    public PlayerUnleashEntityEventContainer(PlayerUnleashEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerUnleashEntityEventInterface listener, PlayerUnleashEntityEvent event) {
        listener.onPlayerUnleashEntityEvent(event);
    }

    @Override
    public Class<PlayerUnleashEntityEventInterface> getListenerType() {
        return PlayerUnleashEntityEventInterface.class;
    }
}
