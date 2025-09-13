package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerQuitEventInterface;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitEventContainer extends ContainerEvent<PlayerQuitEventInterface, PlayerQuitEvent> {

    public PlayerQuitEventContainer(PlayerQuitEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerQuitEventInterface listener, PlayerQuitEvent event) {
        listener.onPlayerQuitEvent(event);
    }

    @Override
    public Class<PlayerQuitEventInterface> getListenerType() {
        return PlayerQuitEventInterface.class;
    }
}
