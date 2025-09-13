package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerDropItemEventInterface;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDropItemEventContainer extends ContainerEvent<PlayerDropItemEventInterface, PlayerDropItemEvent> {

    public PlayerDropItemEventContainer(PlayerDropItemEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerDropItemEventInterface listener, PlayerDropItemEvent event) {
        listener.onPlayerDropItemEvent(event);
    }

    @Override
    public Class<PlayerDropItemEventInterface> getListenerType() {
        return PlayerDropItemEventInterface.class;
    }
}
