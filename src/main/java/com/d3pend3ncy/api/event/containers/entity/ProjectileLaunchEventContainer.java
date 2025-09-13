package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ProjectileLaunchEventInterface;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ProjectileLaunchEventContainer extends ContainerEvent<ProjectileLaunchEventInterface, ProjectileLaunchEvent> {

    public ProjectileLaunchEventContainer(ProjectileLaunchEvent event) {
        super(event);
    }

    @Override
    protected void call(ProjectileLaunchEventInterface listener, ProjectileLaunchEvent event) {
        listener.onProjectileLaunchEvent(event);
    }

    @Override
    public Class<ProjectileLaunchEventInterface> getListenerType() {
        return ProjectileLaunchEventInterface.class;
    }
}
