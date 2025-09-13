package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerChangedMainHandEventInterface;
import org.bukkit.event.player.PlayerChangedMainHandEvent;

public class PlayerChangedMainHandEventContainer extends ContainerEvent<PlayerChangedMainHandEventInterface, PlayerChangedMainHandEvent> {

    public PlayerChangedMainHandEventContainer(PlayerChangedMainHandEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerChangedMainHandEventInterface listener, PlayerChangedMainHandEvent event) {
        listener.onPlayerChangedMainHandEvent(event);
    }

    @Override
    public Class<PlayerChangedMainHandEventInterface> getListenerType() {
        return PlayerChangedMainHandEventInterface.class;
    }
}
