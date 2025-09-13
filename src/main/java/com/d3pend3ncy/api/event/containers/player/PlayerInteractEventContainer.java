package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerInteractEventInterface;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractEventContainer extends ContainerEvent<PlayerInteractEventInterface, PlayerInteractEvent> {

    public PlayerInteractEventContainer(PlayerInteractEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerInteractEventInterface listener, PlayerInteractEvent event) {
        listener.onPlayerInteractEvent(event);
    }

    @Override
    public Class<PlayerInteractEventInterface> getListenerType() {
        return PlayerInteractEventInterface.class;
    }
}
