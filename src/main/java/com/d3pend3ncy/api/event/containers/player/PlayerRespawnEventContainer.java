package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerRespawnEventInterface;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawnEventContainer extends ContainerEvent<PlayerRespawnEventInterface, PlayerRespawnEvent> {

    public PlayerRespawnEventContainer(PlayerRespawnEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerRespawnEventInterface listener, PlayerRespawnEvent event) {
        listener.onPlayerRespawnEvent(event);
    }

    @Override
    public Class<PlayerRespawnEventInterface> getListenerType() {
        return PlayerRespawnEventInterface.class;
    }
}
