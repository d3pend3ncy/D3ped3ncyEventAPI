package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerStatisticIncrementEventInterface;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

public class PlayerStatisticIncrementEventContainer extends ContainerEvent<PlayerStatisticIncrementEventInterface, PlayerStatisticIncrementEvent> {

    public PlayerStatisticIncrementEventContainer(PlayerStatisticIncrementEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerStatisticIncrementEventInterface listener, PlayerStatisticIncrementEvent event) {
        listener.onPlayerStatisticIncrementEvent(event);
    }

    @Override
    public Class<PlayerStatisticIncrementEventInterface> getListenerType() {
        return PlayerStatisticIncrementEventInterface.class;
    }
}
