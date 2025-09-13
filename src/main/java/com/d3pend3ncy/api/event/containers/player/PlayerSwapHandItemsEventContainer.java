package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerSwapHandItemsEventInterface;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class PlayerSwapHandItemsEventContainer extends ContainerEvent<PlayerSwapHandItemsEventInterface, PlayerSwapHandItemsEvent> {

    public PlayerSwapHandItemsEventContainer(PlayerSwapHandItemsEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerSwapHandItemsEventInterface listener, PlayerSwapHandItemsEvent event) {
        listener.onPlayerSwapHandItemsEvent(event);
    }

    @Override
    public Class<PlayerSwapHandItemsEventInterface> getListenerType() {
        return PlayerSwapHandItemsEventInterface.class;
    }
}
