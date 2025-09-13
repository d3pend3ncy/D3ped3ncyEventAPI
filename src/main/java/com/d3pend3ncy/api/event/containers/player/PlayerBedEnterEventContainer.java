package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerBedEnterEventInterface;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBedEnterEventContainer extends ContainerEvent<PlayerBedEnterEventInterface, PlayerBedEnterEvent> {

    public PlayerBedEnterEventContainer(PlayerBedEnterEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerBedEnterEventInterface listener, PlayerBedEnterEvent event) {
        listener.onPlayerBedEnterEvent(event);
    }

    @Override
    public Class<PlayerBedEnterEventInterface> getListenerType() {
        return PlayerBedEnterEventInterface.class;
    }
}
