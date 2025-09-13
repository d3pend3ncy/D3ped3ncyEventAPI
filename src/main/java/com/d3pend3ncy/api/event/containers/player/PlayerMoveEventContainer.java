package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerMoveEventInterface;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveEventContainer extends ContainerEvent<PlayerMoveEventInterface, PlayerMoveEvent> {

    public PlayerMoveEventContainer(PlayerMoveEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerMoveEventInterface listener, PlayerMoveEvent event) {
        listener.onPlayerMoveEvent(event);
    }

    @Override
    public Class<PlayerMoveEventInterface> getListenerType() {
        return PlayerMoveEventInterface.class;
    }
}
