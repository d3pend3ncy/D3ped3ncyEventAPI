package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerPortalEventInterface;
import org.bukkit.event.player.PlayerPortalEvent;

public class PlayerPortalEventContainer extends ContainerEvent<PlayerPortalEventInterface, PlayerPortalEvent> {

    public PlayerPortalEventContainer(PlayerPortalEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerPortalEventInterface listener, PlayerPortalEvent event) {
        listener.onPlayerPortalEvent(event);
    }

    @Override
    public Class<PlayerPortalEventInterface> getListenerType() {
        return PlayerPortalEventInterface.class;
    }
}
