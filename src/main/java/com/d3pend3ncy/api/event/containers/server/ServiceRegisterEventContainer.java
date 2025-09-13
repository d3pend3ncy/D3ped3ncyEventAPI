package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.ServiceRegisterEventInterface;
import org.bukkit.event.server.ServiceRegisterEvent;

public class ServiceRegisterEventContainer extends ContainerEvent<ServiceRegisterEventInterface, ServiceRegisterEvent> {

    public ServiceRegisterEventContainer(ServiceRegisterEvent event) {
        super(event);
    }

    @Override
    protected void call(ServiceRegisterEventInterface listener, ServiceRegisterEvent event) {
        listener.onServiceRegisterEvent(event);
    }

    @Override
    public Class<ServiceRegisterEventInterface> getListenerType() {
        return ServiceRegisterEventInterface.class;
    }
}
