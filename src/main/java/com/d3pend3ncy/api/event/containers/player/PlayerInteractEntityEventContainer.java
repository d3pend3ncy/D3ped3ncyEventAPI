package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerInteractEntityEventInterface;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PlayerInteractEntityEventContainer extends ContainerEvent<PlayerInteractEntityEventInterface, PlayerInteractEntityEvent> {

    public PlayerInteractEntityEventContainer(PlayerInteractEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerInteractEntityEventInterface listener, PlayerInteractEntityEvent event) {
        listener.onPlayerInteractEntityEvent(event);
    }

    @Override
    public Class<PlayerInteractEntityEventInterface> getListenerType() {
        return PlayerInteractEntityEventInterface.class;
    }
}
