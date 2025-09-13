package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerLoginEventInterface;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerLoginEventContainer extends ContainerEvent<PlayerLoginEventInterface, PlayerLoginEvent> {

    public PlayerLoginEventContainer(PlayerLoginEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerLoginEventInterface listener, PlayerLoginEvent event) {
        listener.onPlayerLoginEvent(event);
    }

    @Override
    public Class<PlayerLoginEventInterface> getListenerType() {
        return PlayerLoginEventInterface.class;
    }
}
