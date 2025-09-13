package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerJoinEventInterface;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEventContainer extends ContainerEvent<PlayerJoinEventInterface, PlayerJoinEvent> {

    public PlayerJoinEventContainer(PlayerJoinEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerJoinEventInterface listener, PlayerJoinEvent event) {
        listener.onPlayerJoinEvent(event);
    }

    @Override
    public Class<PlayerJoinEventInterface> getListenerType() {
        return PlayerJoinEventInterface.class;
    }
}
