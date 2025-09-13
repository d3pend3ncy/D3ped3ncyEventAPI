package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerRiptideEventInterface;
import org.bukkit.event.player.PlayerRiptideEvent;

public class PlayerRiptideEventContainer extends ContainerEvent<PlayerRiptideEventInterface, PlayerRiptideEvent> {

    public PlayerRiptideEventContainer(PlayerRiptideEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerRiptideEventInterface listener, PlayerRiptideEvent event) {
        listener.onPlayerRiptideEvent(event);
    }

    @Override
    public Class<PlayerRiptideEventInterface> getListenerType() {
        return PlayerRiptideEventInterface.class;
    }
}
