package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerExpChangeEventInterface;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class PlayerExpChangeEventContainer extends ContainerEvent<PlayerExpChangeEventInterface, PlayerExpChangeEvent> {

    public PlayerExpChangeEventContainer(PlayerExpChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerExpChangeEventInterface listener, PlayerExpChangeEvent event) {
        listener.onPlayerExpChangeEvent(event);
    }

    @Override
    public Class<PlayerExpChangeEventInterface> getListenerType() {
        return PlayerExpChangeEventInterface.class;
    }
}
