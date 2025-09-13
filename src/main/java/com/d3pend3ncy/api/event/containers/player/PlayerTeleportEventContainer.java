package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerTeleportEventInterface;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PlayerTeleportEventContainer extends ContainerEvent<PlayerTeleportEventInterface, PlayerTeleportEvent> {

    public PlayerTeleportEventContainer(PlayerTeleportEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerTeleportEventInterface listener, PlayerTeleportEvent event) {
        listener.onPlayerTeleportEvent(event);
    }

    @Override
    public Class<PlayerTeleportEventInterface> getListenerType() {
        return PlayerTeleportEventInterface.class;
    }
}
