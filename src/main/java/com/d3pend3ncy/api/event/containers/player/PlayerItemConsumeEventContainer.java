package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerItemConsumeEventInterface;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class PlayerItemConsumeEventContainer extends ContainerEvent<PlayerItemConsumeEventInterface, PlayerItemConsumeEvent> {

    public PlayerItemConsumeEventContainer(PlayerItemConsumeEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerItemConsumeEventInterface listener, PlayerItemConsumeEvent event) {
        listener.onPlayerItemConsumeEvent(event);
    }

    @Override
    public Class<PlayerItemConsumeEventInterface> getListenerType() {
        return PlayerItemConsumeEventInterface.class;
    }
}
