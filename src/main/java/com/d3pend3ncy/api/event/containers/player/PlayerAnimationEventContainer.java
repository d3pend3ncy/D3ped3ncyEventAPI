package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.PlayerAnimationEventInterface;
import org.bukkit.event.player.PlayerAnimationEvent;

public class PlayerAnimationEventContainer extends ContainerEvent<PlayerAnimationEventInterface, PlayerAnimationEvent> {

    public PlayerAnimationEventContainer(PlayerAnimationEvent event) {
        super(event);
    }

    @Override
    protected void call(PlayerAnimationEventInterface listener, PlayerAnimationEvent event) {
        listener.onPlayerAnimationEvent(event);
    }

    @Override
    public Class<PlayerAnimationEventInterface> getListenerType() {
        return PlayerAnimationEventInterface.class;
    }
}
