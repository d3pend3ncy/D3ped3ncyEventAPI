package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.*;
import com.d3pend3ncy.api.event.containers.server.*;

public class RegisterServer implements Listener {

    public RegisterServer() {}

    @EventHandler
    public void onBroadcastMessageEvent(BroadcastMessageEvent event) {
        BroadcastMessageEventContainer container = new BroadcastMessageEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onMapInitializeEvent(MapInitializeEvent event) {
        MapInitializeEventContainer container = new MapInitializeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPluginDisableEvent(PluginDisableEvent event) {
        PluginDisableEventContainer container = new PluginDisableEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPluginEnableEvent(PluginEnableEvent event) {
        PluginEnableEventContainer container = new PluginEnableEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onRemoteServerCommandEvent(RemoteServerCommandEvent event) {
        RemoteServerCommandEventContainer container = new RemoteServerCommandEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onServerCommandEvent(ServerCommandEvent event) {
        ServerCommandEventContainer container = new ServerCommandEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onServerListPingEvent(ServerListPingEvent event) {
        ServerListPingEventContainer container = new ServerListPingEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onServiceRegisterEvent(ServiceRegisterEvent event) {
        ServiceRegisterEventContainer container = new ServiceRegisterEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onServiceUnregisterEvent(ServiceUnregisterEvent event) {
        ServiceUnregisterEventContainer container = new ServiceUnregisterEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onTabCompleteEvent(TabCompleteEvent event) {
        TabCompleteEventContainer container = new TabCompleteEventContainer(event);
        eventManager.fire(container);
    }

}
