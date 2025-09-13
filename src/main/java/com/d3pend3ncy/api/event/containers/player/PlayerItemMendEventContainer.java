package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerItemMendEventInterface;
import org.bukkit.event.player.PlayerItemMendEvent;

public class PlayerItemMendEventContainer extends ContainerEvent<PlayerItemMendEventInterface, PlayerItemMendEvent> {

    public PlayerItemMendEventContainer(PlayerItemMendEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerItemMendEventInterface listener, PlayerItemMendEvent event) {
        listener.onPlayerItemMendEvent(event);
    }

    @Override
    public Class<PlayerItemMendEventInterface> getListenerType() {
        return PlayerItemMendEventInterface.class;
    }
}
