package com.d3pend3ncy.api.event.core.types;

public abstract class cancelEvent<T extends Listener> extends event<T> {
    private boolean isCancelled = false;

    public boolean isCancelled()
    {
        return isCancelled;
    }

    public void cancel()
    {
        isCancelled = true;
    }
}