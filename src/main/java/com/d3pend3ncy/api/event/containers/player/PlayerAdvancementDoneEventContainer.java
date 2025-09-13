package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerAdvancementDoneEventInterface;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class PlayerAdvancementDoneEventContainer extends ContainerEvent<PlayerAdvancementDoneEventInterface, PlayerAdvancementDoneEvent> {

    public PlayerAdvancementDoneEventContainer(PlayerAdvancementDoneEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerAdvancementDoneEventInterface listener, PlayerAdvancementDoneEvent event) {
        listener.onPlayerAdvancementDoneEvent(event);
    }

    @Override
    public Class<PlayerAdvancementDoneEventInterface> getListenerType() {
        return PlayerAdvancementDoneEventInterface.class;
    }
}
