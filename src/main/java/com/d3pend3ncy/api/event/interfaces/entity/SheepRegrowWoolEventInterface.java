package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.SheepRegrowWoolEvent;

public interface SheepRegrowWoolEventInterface extends Listener {
    void onSheepRegrowWoolEvent(SheepRegrowWoolEvent event);
}
