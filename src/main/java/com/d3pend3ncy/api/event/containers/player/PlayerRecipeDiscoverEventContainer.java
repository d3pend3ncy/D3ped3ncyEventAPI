package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerRecipeDiscoverEventInterface;
import org.bukkit.event.player.PlayerRecipeDiscoverEvent;

public class PlayerRecipeDiscoverEventContainer extends ContainerEvent<PlayerRecipeDiscoverEventInterface, PlayerRecipeDiscoverEvent> {

    public PlayerRecipeDiscoverEventContainer(PlayerRecipeDiscoverEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerRecipeDiscoverEventInterface listener, PlayerRecipeDiscoverEvent event) {
        listener.onPlayerRecipeDiscoverEvent(event);
    }

    @Override
    public Class<PlayerRecipeDiscoverEventInterface> getListenerType() {
        return PlayerRecipeDiscoverEventInterface.class;
    }
}
