package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.ServiceUnregisterEventInterface;
import org.bukkit.event.server.ServiceUnregisterEvent;

public class ServiceUnregisterEventContainer extends ContainerEvent<ServiceUnregisterEventInterface, ServiceUnregisterEvent> {

    public ServiceUnregisterEventContainer(ServiceUnregisterEvent event) {
        super(event);
    }

    @Override
    protected void call(ServiceUnregisterEventInterface listener, ServiceUnregisterEvent event) {
        listener.onServiceUnregisterEvent(event);
    }

    @Override
    public Class<ServiceUnregisterEventInterface> getListenerType() {
        return ServiceUnregisterEventInterface.class;
    }
}
