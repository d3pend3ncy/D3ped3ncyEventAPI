package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.HorseJumpEvent;

public interface HorseJumpEventInterface extends Listener {
    void onHorseJumpEvent(HorseJumpEvent event);
}
