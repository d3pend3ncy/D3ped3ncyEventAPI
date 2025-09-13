package com.d3pend3ncy.api.event.core.baseTypes;

import com.d3pend3ncy.api.event.core.types.event;
import com.d3pend3ncy.api.event.core.types.Listener;

import java.util.ArrayList;

public abstract class ContainerEvent<L extends Listener, E> extends event<L> {

    protected final E event;

    public ContainerEvent(E event) {
        this.event = event;
    }

    /** Returns the underlying event object */
    public E get() {
        return event;
    }

    @Override
    public void fire(ArrayList<L> listeners) {
        for (L listener : listeners) {
            call(listener, event);
        }
    }

    protected abstract void call(L listener, E event);
}
