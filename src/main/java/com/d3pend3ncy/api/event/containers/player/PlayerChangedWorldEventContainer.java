package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerChangedWorldEventInterface;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class PlayerChangedWorldEventContainer extends ContainerEvent<PlayerChangedWorldEventInterface, PlayerChangedWorldEvent> {

    public PlayerChangedWorldEventContainer(PlayerChangedWorldEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerChangedWorldEventInterface listener, PlayerChangedWorldEvent event) {
        listener.onPlayerChangedWorldEvent(event);
    }

    @Override
    public Class<PlayerChangedWorldEventInterface> getListenerType() {
        return PlayerChangedWorldEventInterface.class;
    }
}
