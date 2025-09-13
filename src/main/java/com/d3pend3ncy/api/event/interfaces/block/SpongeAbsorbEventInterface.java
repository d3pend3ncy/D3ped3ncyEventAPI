package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.SpongeAbsorbEvent;

public interface SpongeAbsorbEventInterface extends Listener {
    void onSpongeAbsorbEvent(SpongeAbsorbEvent event);
}
