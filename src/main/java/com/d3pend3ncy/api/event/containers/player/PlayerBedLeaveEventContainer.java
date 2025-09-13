package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerBedLeaveEventInterface;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerBedLeaveEventContainer extends ContainerEvent<PlayerBedLeaveEventInterface, PlayerBedLeaveEvent> {

    public PlayerBedLeaveEventContainer(PlayerBedLeaveEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerBedLeaveEventInterface listener, PlayerBedLeaveEvent event) {
        listener.onPlayerBedLeaveEvent(event);
    }

    @Override
    public Class<PlayerBedLeaveEventInterface> getListenerType() {
        return PlayerBedLeaveEventInterface.class;
    }
}
