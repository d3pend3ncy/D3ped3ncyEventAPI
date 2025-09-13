package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;

public interface PlayerArmorStandManipulateEventInterface extends Listener {
    void onPlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEvent event);
}
