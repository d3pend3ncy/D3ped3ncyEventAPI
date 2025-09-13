package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerItemBreakEventInterface;
import org.bukkit.event.player.PlayerItemBreakEvent;

public class PlayerItemBreakEventContainer extends ContainerEvent<PlayerItemBreakEventInterface, PlayerItemBreakEvent> {

    public PlayerItemBreakEventContainer(PlayerItemBreakEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerItemBreakEventInterface listener, PlayerItemBreakEvent event) {
        listener.onPlayerItemBreakEvent(event);
    }

    @Override
    public Class<PlayerItemBreakEventInterface> getListenerType() {
        return PlayerItemBreakEventInterface.class;
    }
}
