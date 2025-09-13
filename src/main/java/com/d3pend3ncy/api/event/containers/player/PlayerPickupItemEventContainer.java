package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerPickupItemEventInterface;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PlayerPickupItemEventContainer extends ContainerEvent<PlayerPickupItemEventInterface, PlayerPickupItemEvent> {

    public PlayerPickupItemEventContainer(PlayerPickupItemEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerPickupItemEventInterface listener, PlayerPickupItemEvent event) {
        listener.onPlayerPickupItemEvent(event);
    }

    @Override
    public Class<PlayerPickupItemEventInterface> getListenerType() {
        return PlayerPickupItemEventInterface.class;
    }
}
