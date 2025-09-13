package com.d3pend3ncy.api.event.core.types;

import java.util.ArrayList;

public abstract class event<T extends Listener> {
    public abstract void fire(ArrayList<T> listeners);

    public abstract Class<T> getListenerType();
}
