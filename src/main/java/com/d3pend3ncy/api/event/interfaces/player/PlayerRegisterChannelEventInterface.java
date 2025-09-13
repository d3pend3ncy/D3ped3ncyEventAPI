package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerRegisterChannelEvent;

public interface PlayerRegisterChannelEventInterface extends Listener {
    void onPlayerRegisterChannelEvent(PlayerRegisterChannelEvent event);
}
