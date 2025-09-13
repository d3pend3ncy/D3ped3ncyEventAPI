package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerArmorStandManipulateEventInterface;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;

public class PlayerArmorStandManipulateEventContainer extends ContainerEvent<PlayerArmorStandManipulateEventInterface, PlayerArmorStandManipulateEvent> {

    public PlayerArmorStandManipulateEventContainer(PlayerArmorStandManipulateEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerArmorStandManipulateEventInterface listener, PlayerArmorStandManipulateEvent event) {
        listener.onPlayerArmorStandManipulateEvent(event);
    }

    @Override
    public Class<PlayerArmorStandManipulateEventInterface> getListenerType() {
        return PlayerArmorStandManipulateEventInterface.class;
    }
}
