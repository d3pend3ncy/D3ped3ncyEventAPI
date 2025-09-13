package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.SignChangeEventInterface;
import org.bukkit.event.block.SignChangeEvent;

public class SignChangeEventContainer extends ContainerEvent<SignChangeEventInterface, SignChangeEvent> {

    public SignChangeEventContainer(SignChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(SignChangeEventInterface listener, SignChangeEvent event) {
        listener.onSignChangeEvent(event);
    }

    @Override
    public Class<SignChangeEventInterface> getListenerType() {
        return SignChangeEventInterface.class;
    }
}
