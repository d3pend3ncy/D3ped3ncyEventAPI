package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerToggleFlightEventInterface;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class PlayerToggleFlightEventContainer extends ContainerEvent<PlayerToggleFlightEventInterface, PlayerToggleFlightEvent> {

    public PlayerToggleFlightEventContainer(PlayerToggleFlightEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerToggleFlightEventInterface listener, PlayerToggleFlightEvent event) {
        listener.onPlayerToggleFlightEvent(event);
    }

    @Override
    public Class<PlayerToggleFlightEventInterface> getListenerType() {
        return PlayerToggleFlightEventInterface.class;
    }
}
