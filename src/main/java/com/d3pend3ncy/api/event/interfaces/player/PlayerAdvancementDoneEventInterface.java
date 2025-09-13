package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public interface PlayerAdvancementDoneEventInterface extends Listener {
    void onPlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event);
}
