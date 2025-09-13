package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerFishEventInterface;
import org.bukkit.event.player.PlayerFishEvent;

public class PlayerFishEventContainer extends ContainerEvent<PlayerFishEventInterface, PlayerFishEvent> {

    public PlayerFishEventContainer(PlayerFishEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerFishEventInterface listener, PlayerFishEvent event) {
        listener.onPlayerFishEvent(event);
    }

    @Override
    public Class<PlayerFishEventInterface> getListenerType() {
        return PlayerFishEventInterface.class;
    }
}
