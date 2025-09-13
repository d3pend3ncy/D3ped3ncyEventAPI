package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ProjectileHitEventInterface;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileHitEventContainer extends ContainerEvent<ProjectileHitEventInterface, ProjectileHitEvent> {

    public ProjectileHitEventContainer(ProjectileHitEvent event) {
        super(event);
    }

    @Override
    protected void call(ProjectileHitEventInterface listener, ProjectileHitEvent event) {
        listener.onProjectileHitEvent(event);
    }

    @Override
    public Class<ProjectileHitEventInterface> getListenerType() {
        return ProjectileHitEventInterface.class;
    }
}
