package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerLevelChangeEventInterface;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class PlayerLevelChangeEventContainer extends ContainerEvent<PlayerLevelChangeEventInterface, PlayerLevelChangeEvent> {

    public PlayerLevelChangeEventContainer(PlayerLevelChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerLevelChangeEventInterface listener, PlayerLevelChangeEvent event) {
        listener.onPlayerLevelChangeEvent(event);
    }

    @Override
    public Class<PlayerLevelChangeEventInterface> getListenerType() {
        return PlayerLevelChangeEventInterface.class;
    }
}
