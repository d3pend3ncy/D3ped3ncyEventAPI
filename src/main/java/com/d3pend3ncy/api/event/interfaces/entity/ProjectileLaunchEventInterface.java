package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public interface ProjectileLaunchEventInterface extends Listener {
    void onProjectileLaunchEvent(ProjectileLaunchEvent event);
}
