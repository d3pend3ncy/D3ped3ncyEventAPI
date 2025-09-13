package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerRiptideEvent;

public interface PlayerRiptideEventInterface extends Listener {
    void onPlayerRiptideEvent(PlayerRiptideEvent event);
}
