package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerEditBookEventInterface;
import org.bukkit.event.player.PlayerEditBookEvent;

public class PlayerEditBookEventContainer extends ContainerEvent<PlayerEditBookEventInterface, PlayerEditBookEvent> {

    public PlayerEditBookEventContainer(PlayerEditBookEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerEditBookEventInterface listener, PlayerEditBookEvent event) {
        listener.onPlayerEditBookEvent(event);
    }

    @Override
    public Class<PlayerEditBookEventInterface> getListenerType() {
        return PlayerEditBookEventInterface.class;
    }
}
