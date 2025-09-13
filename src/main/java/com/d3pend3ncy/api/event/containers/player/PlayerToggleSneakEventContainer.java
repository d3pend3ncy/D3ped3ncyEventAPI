package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerToggleSneakEventInterface;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerToggleSneakEventContainer extends ContainerEvent<PlayerToggleSneakEventInterface, PlayerToggleSneakEvent> {

    public PlayerToggleSneakEventContainer(PlayerToggleSneakEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerToggleSneakEventInterface listener, PlayerToggleSneakEvent event) {
        listener.onPlayerToggleSneakEvent(event);
    }

    @Override
    public Class<PlayerToggleSneakEventInterface> getListenerType() {
        return PlayerToggleSneakEventInterface.class;
    }
}
