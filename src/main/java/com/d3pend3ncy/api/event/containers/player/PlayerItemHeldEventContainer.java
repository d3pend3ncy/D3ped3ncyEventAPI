package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerItemHeldEventInterface;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class PlayerItemHeldEventContainer extends ContainerEvent<PlayerItemHeldEventInterface, PlayerItemHeldEvent> {

    public PlayerItemHeldEventContainer(PlayerItemHeldEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerItemHeldEventInterface listener, PlayerItemHeldEvent event) {
        listener.onPlayerItemHeldEvent(event);
    }

    @Override
    public Class<PlayerItemHeldEventInterface> getListenerType() {
        return PlayerItemHeldEventInterface.class;
    }
}
