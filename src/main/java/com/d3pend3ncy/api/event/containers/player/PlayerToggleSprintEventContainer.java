package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerToggleSprintEventInterface;
import org.bukkit.event.player.PlayerToggleSprintEvent;

public class PlayerToggleSprintEventContainer extends ContainerEvent<PlayerToggleSprintEventInterface, PlayerToggleSprintEvent> {

    public PlayerToggleSprintEventContainer(PlayerToggleSprintEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerToggleSprintEventInterface listener, PlayerToggleSprintEvent event) {
        listener.onPlayerToggleSprintEvent(event);
    }

    @Override
    public Class<PlayerToggleSprintEventInterface> getListenerType() {
        return PlayerToggleSprintEventInterface.class;
    }
}
