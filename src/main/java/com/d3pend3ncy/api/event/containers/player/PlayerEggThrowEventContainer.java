package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerEggThrowEventInterface;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class PlayerEggThrowEventContainer extends ContainerEvent<PlayerEggThrowEventInterface, PlayerEggThrowEvent> {

    public PlayerEggThrowEventContainer(PlayerEggThrowEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerEggThrowEventInterface listener, PlayerEggThrowEvent event) {
        listener.onPlayerEggThrowEvent(event);
    }

    @Override
    public Class<PlayerEggThrowEventInterface> getListenerType() {
        return PlayerEggThrowEventInterface.class;
    }
}
