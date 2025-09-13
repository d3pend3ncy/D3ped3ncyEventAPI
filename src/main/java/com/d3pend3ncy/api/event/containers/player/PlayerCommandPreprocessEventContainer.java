package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerCommandPreprocessEventInterface;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerCommandPreprocessEventContainer extends ContainerEvent<PlayerCommandPreprocessEventInterface, PlayerCommandPreprocessEvent> {

    public PlayerCommandPreprocessEventContainer(PlayerCommandPreprocessEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerCommandPreprocessEventInterface listener, PlayerCommandPreprocessEvent event) {
        listener.onPlayerCommandPreprocessEvent(event);
    }

    @Override
    public Class<PlayerCommandPreprocessEventInterface> getListenerType() {
        return PlayerCommandPreprocessEventInterface.class;
    }
}
