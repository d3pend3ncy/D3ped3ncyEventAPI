package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.SheepDyeWoolEvent;

public interface SheepDyeWoolEventInterface extends Listener {
    void onSheepDyeWoolEvent(SheepDyeWoolEvent event);
}
