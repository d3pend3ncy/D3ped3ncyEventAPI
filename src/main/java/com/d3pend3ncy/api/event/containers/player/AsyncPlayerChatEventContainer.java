package com.d3pend3ncy.api.event.containers.player;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.player.AsyncPlayerChatEventInterface;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChatEventContainer extends ContainerEvent<AsyncPlayerChatEventInterface, AsyncPlayerChatEvent> {

    public AsyncPlayerChatEventContainer(AsyncPlayerChatEvent event) {
        super(event);
    }

    @Override
    protected void call(AsyncPlayerChatEventInterface listener, AsyncPlayerChatEvent event) {
        listener.onAsyncPlayerChatEvent(event);
    }

    @Override
    public Class<AsyncPlayerChatEventInterface> getListenerType() {
        return AsyncPlayerChatEventInterface.class;
    }
}
