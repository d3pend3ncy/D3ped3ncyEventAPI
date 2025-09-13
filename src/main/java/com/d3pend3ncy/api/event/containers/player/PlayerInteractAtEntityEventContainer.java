package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerInteractAtEntityEventInterface;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class PlayerInteractAtEntityEventContainer extends ContainerEvent<PlayerInteractAtEntityEventInterface, PlayerInteractAtEntityEvent> {

    public PlayerInteractAtEntityEventContainer(PlayerInteractAtEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerInteractAtEntityEventInterface listener, PlayerInteractAtEntityEvent event) {
        listener.onPlayerInteractAtEntityEvent(event);
    }

    @Override
    public Class<PlayerInteractAtEntityEventInterface> getListenerType() {
        return PlayerInteractAtEntityEventInterface.class;
    }
}
