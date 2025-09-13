package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.*;
import com.d3pend3ncy.api.event.containers.player.*;

public class RegisterPlayer implements Listener {

    public RegisterPlayer() {}

    @EventHandler
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        AsyncPlayerChatEventContainer container = new AsyncPlayerChatEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event) {
        PlayerAdvancementDoneEventContainer container = new PlayerAdvancementDoneEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerAnimationEvent(PlayerAnimationEvent event) {
        PlayerAnimationEventContainer container = new PlayerAnimationEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEvent event) {
        PlayerArmorStandManipulateEventContainer container = new PlayerArmorStandManipulateEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerBedEnterEvent(PlayerBedEnterEvent event) {
        PlayerBedEnterEventContainer container = new PlayerBedEnterEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerBedLeaveEvent(PlayerBedLeaveEvent event) {
        PlayerBedLeaveEventContainer container = new PlayerBedLeaveEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent event) {
        PlayerBucketEmptyEventContainer container = new PlayerBucketEmptyEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerBucketFillEvent(PlayerBucketFillEvent event) {
        PlayerBucketFillEventContainer container = new PlayerBucketFillEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerChangedMainHandEvent(PlayerChangedMainHandEvent event) {
        PlayerChangedMainHandEventContainer container = new PlayerChangedMainHandEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
        PlayerChangedWorldEventContainer container = new PlayerChangedWorldEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerChannelEvent(PlayerChannelEvent event) {
        PlayerChannelEventContainer container = new PlayerChannelEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
        PlayerCommandPreprocessEventContainer container = new PlayerCommandPreprocessEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerCommandSendEvent(PlayerCommandSendEvent event) {
        PlayerCommandSendEventContainer container = new PlayerCommandSendEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
        PlayerDropItemEventContainer container = new PlayerDropItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerEditBookEvent(PlayerEditBookEvent event) {
        PlayerEditBookEventContainer container = new PlayerEditBookEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerEggThrowEvent(PlayerEggThrowEvent event) {
        PlayerEggThrowEventContainer container = new PlayerEggThrowEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerExpChangeEvent(PlayerExpChangeEvent event) {
        PlayerExpChangeEventContainer container = new PlayerExpChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerFishEvent(PlayerFishEvent event) {
        PlayerFishEventContainer container = new PlayerFishEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {
        PlayerGameModeChangeEventContainer container = new PlayerGameModeChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
        PlayerInteractAtEntityEventContainer container = new PlayerInteractAtEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
        PlayerInteractEntityEventContainer container = new PlayerInteractEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        PlayerInteractEventContainer container = new PlayerInteractEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerItemBreakEvent(PlayerItemBreakEvent event) {
        PlayerItemBreakEventContainer container = new PlayerItemBreakEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event) {
        PlayerItemConsumeEventContainer container = new PlayerItemConsumeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerItemHeldEvent(PlayerItemHeldEvent event) {
        PlayerItemHeldEventContainer container = new PlayerItemHeldEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerItemMendEvent(PlayerItemMendEvent event) {
        PlayerItemMendEventContainer container = new PlayerItemMendEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        PlayerJoinEventContainer container = new PlayerJoinEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerKickEvent(PlayerKickEvent event) {
        PlayerKickEventContainer container = new PlayerKickEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
        PlayerLevelChangeEventContainer container = new PlayerLevelChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerLoginEvent(PlayerLoginEvent event) {
        PlayerLoginEventContainer container = new PlayerLoginEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        PlayerMoveEventContainer container = new PlayerMoveEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerPickupItemEvent(PlayerPickupItemEvent event) {
        PlayerPickupItemEventContainer container = new PlayerPickupItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerPortalEvent(PlayerPortalEvent event) {
        PlayerPortalEventContainer container = new PlayerPortalEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        PlayerQuitEventContainer container = new PlayerQuitEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerRecipeDiscoverEvent(PlayerRecipeDiscoverEvent event) {
        PlayerRecipeDiscoverEventContainer container = new PlayerRecipeDiscoverEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerRegisterChannelEvent(PlayerRegisterChannelEvent event) {
        PlayerRegisterChannelEventContainer container = new PlayerRegisterChannelEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {
        PlayerRespawnEventContainer container = new PlayerRespawnEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerRiptideEvent(PlayerRiptideEvent event) {
        PlayerRiptideEventContainer container = new PlayerRiptideEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerShearEntityEvent(PlayerShearEntityEvent event) {
        PlayerShearEntityEventContainer container = new PlayerShearEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerStatisticIncrementEvent(PlayerStatisticIncrementEvent event) {
        PlayerStatisticIncrementEventContainer container = new PlayerStatisticIncrementEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent event) {
        PlayerSwapHandItemsEventContainer container = new PlayerSwapHandItemsEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerTeleportEvent(PlayerTeleportEvent event) {
        PlayerTeleportEventContainer container = new PlayerTeleportEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerToggleFlightEvent(PlayerToggleFlightEvent event) {
        PlayerToggleFlightEventContainer container = new PlayerToggleFlightEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event) {
        PlayerToggleSneakEventContainer container = new PlayerToggleSneakEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerToggleSprintEvent(PlayerToggleSprintEvent event) {
        PlayerToggleSprintEventContainer container = new PlayerToggleSprintEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerUnleashEntityEvent(PlayerUnleashEntityEvent event) {
        PlayerUnleashEntityEventContainer container = new PlayerUnleashEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerUnregisterChannelEvent(PlayerUnregisterChannelEvent event) {
        PlayerUnregisterChannelEventContainer container = new PlayerUnregisterChannelEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerVelocityEvent(PlayerVelocityEvent event) {
        PlayerVelocityEventContainer container = new PlayerVelocityEventContainer(event);
        eventManager.fire(container);
    }

}
