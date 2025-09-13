package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public interface PlayerBucketEmptyEventInterface extends Listener {
    void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent event);
}
