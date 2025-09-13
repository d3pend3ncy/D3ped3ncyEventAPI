package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.PlayerDeathEventInterface;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathEventContainer extends ContainerEvent<PlayerDeathEventInterface, PlayerDeathEvent> {

    public PlayerDeathEventContainer(PlayerDeathEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerDeathEventInterface listener, PlayerDeathEvent event) {
        listener.onPlayerDeathEvent(event);
    }

    @Override
    public Class<PlayerDeathEventInterface> getListenerType() {
        return PlayerDeathEventInterface.class;
    }
}
