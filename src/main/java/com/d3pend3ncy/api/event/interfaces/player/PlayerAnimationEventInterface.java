package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerAnimationEvent;

public interface PlayerAnimationEventInterface extends Listener {
    void onPlayerAnimationEvent(PlayerAnimationEvent event);
}
