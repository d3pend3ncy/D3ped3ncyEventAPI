package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerGameModeChangeEventInterface;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class PlayerGameModeChangeEventContainer extends ContainerEvent<PlayerGameModeChangeEventInterface, PlayerGameModeChangeEvent> {

    public PlayerGameModeChangeEventContainer(PlayerGameModeChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerGameModeChangeEventInterface listener, PlayerGameModeChangeEvent event) {
        listener.onPlayerGameModeChangeEvent(event);
    }

    @Override
    public Class<PlayerGameModeChangeEventInterface> getListenerType() {
        return PlayerGameModeChangeEventInterface.class;
    }
}
