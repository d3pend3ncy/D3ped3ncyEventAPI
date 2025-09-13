package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.*;
import com.d3pend3ncy.api.event.containers.entity.*;

public class RegisterEntity implements Listener {

    public RegisterEntity() {}

    @EventHandler
    public void onAreaEffectCloudApplyEvent(AreaEffectCloudApplyEvent event) {
        AreaEffectCloudApplyEventContainer container = new AreaEffectCloudApplyEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBatToggleSleepEvent(BatToggleSleepEvent event) {
        BatToggleSleepEventContainer container = new BatToggleSleepEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onCreatureSpawnEvent(CreatureSpawnEvent event) {
        CreatureSpawnEventContainer container = new CreatureSpawnEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onCreeperPowerEvent(CreeperPowerEvent event) {
        CreeperPowerEventContainer container = new CreeperPowerEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEnderDragonChangePhaseEvent(EnderDragonChangePhaseEvent event) {
        EnderDragonChangePhaseEventContainer container = new EnderDragonChangePhaseEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityAirChangeEvent(EntityAirChangeEvent event) {
        EntityAirChangeEventContainer container = new EntityAirChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityBreakDoorEvent(EntityBreakDoorEvent event) {
        EntityBreakDoorEventContainer container = new EntityBreakDoorEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityBreedEvent(EntityBreedEvent event) {
        EntityBreedEventContainer container = new EntityBreedEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityChangeBlockEvent(EntityChangeBlockEvent event) {
        EntityChangeBlockEventContainer container = new EntityChangeBlockEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityCombustByBlockEvent(EntityCombustByBlockEvent event) {
        EntityCombustByBlockEventContainer container = new EntityCombustByBlockEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityCombustByEntityEvent(EntityCombustByEntityEvent event) {
        EntityCombustByEntityEventContainer container = new EntityCombustByEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityCombustEvent(EntityCombustEvent event) {
        EntityCombustEventContainer container = new EntityCombustEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityCreatePortalEvent(EntityCreatePortalEvent event) {
        EntityCreatePortalEventContainer container = new EntityCreatePortalEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityDamageByBlockEvent(EntityDamageByBlockEvent event) {
        EntityDamageByBlockEventContainer container = new EntityDamageByBlockEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
        EntityDamageByEntityEventContainer container = new EntityDamageByEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent event) {
        EntityDamageEventContainer container = new EntityDamageEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent event) {
        EntityDeathEventContainer container = new EntityDeathEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityDropItemEvent(EntityDropItemEvent event) {
        EntityDropItemEventContainer container = new EntityDropItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityExplodeEvent(EntityExplodeEvent event) {
        EntityExplodeEventContainer container = new EntityExplodeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityInteractEvent(EntityInteractEvent event) {
        EntityInteractEventContainer container = new EntityInteractEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityPickupItemEvent(EntityPickupItemEvent event) {
        EntityPickupItemEventContainer container = new EntityPickupItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityPortalEnterEvent(EntityPortalEnterEvent event) {
        EntityPortalEnterEventContainer container = new EntityPortalEnterEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityPortalEvent(EntityPortalEvent event) {
        EntityPortalEventContainer container = new EntityPortalEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityPortalExitEvent(EntityPortalExitEvent event) {
        EntityPortalExitEventContainer container = new EntityPortalExitEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityPotionEffectEvent(EntityPotionEffectEvent event) {
        EntityPotionEffectEventContainer container = new EntityPotionEffectEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityRegainHealthEvent(EntityRegainHealthEvent event) {
        EntityRegainHealthEventContainer container = new EntityRegainHealthEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityResurrectEvent(EntityResurrectEvent event) {
        EntityResurrectEventContainer container = new EntityResurrectEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityShootBowEvent(EntityShootBowEvent event) {
        EntityShootBowEventContainer container = new EntityShootBowEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityTameEvent(EntityTameEvent event) {
        EntityTameEventContainer container = new EntityTameEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityTargetEvent(EntityTargetEvent event) {
        EntityTargetEventContainer container = new EntityTargetEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event) {
        EntityTargetLivingEntityEventContainer container = new EntityTargetLivingEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityTeleportEvent(EntityTeleportEvent event) {
        EntityTeleportEventContainer container = new EntityTeleportEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityToggleGlideEvent(EntityToggleGlideEvent event) {
        EntityToggleGlideEventContainer container = new EntityToggleGlideEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityToggleSwimEvent(EntityToggleSwimEvent event) {
        EntityToggleSwimEventContainer container = new EntityToggleSwimEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityUnleashEvent(EntityUnleashEvent event) {
        EntityUnleashEventContainer container = new EntityUnleashEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onExpBottleEvent(ExpBottleEvent event) {
        ExpBottleEventContainer container = new ExpBottleEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onExplosionPrimeEvent(ExplosionPrimeEvent event) {
        ExplosionPrimeEventContainer container = new ExplosionPrimeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onFireworkExplodeEvent(FireworkExplodeEvent event) {
        FireworkExplodeEventContainer container = new FireworkExplodeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onFoodLevelChangeEvent(FoodLevelChangeEvent event) {
        FoodLevelChangeEventContainer container = new FoodLevelChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onHorseJumpEvent(HorseJumpEvent event) {
        HorseJumpEventContainer container = new HorseJumpEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onItemDespawnEvent(ItemDespawnEvent event) {
        ItemDespawnEventContainer container = new ItemDespawnEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onItemMergeEvent(ItemMergeEvent event) {
        ItemMergeEventContainer container = new ItemMergeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onItemSpawnEvent(ItemSpawnEvent event) {
        ItemSpawnEventContainer container = new ItemSpawnEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onLingeringPotionSplashEvent(LingeringPotionSplashEvent event) {
        LingeringPotionSplashEventContainer container = new LingeringPotionSplashEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPigZapEvent(PigZapEvent event) {
        PigZapEventContainer container = new PigZapEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPigZombieAngerEvent(PigZombieAngerEvent event) {
        PigZombieAngerEventContainer container = new PigZombieAngerEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
        PlayerDeathEventContainer container = new PlayerDeathEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPlayerLeashEntityEvent(PlayerLeashEntityEvent event) {
        PlayerLeashEntityEventContainer container = new PlayerLeashEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPotionSplashEvent(PotionSplashEvent event) {
        PotionSplashEventContainer container = new PotionSplashEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onProjectileHitEvent(ProjectileHitEvent event) {
        ProjectileHitEventContainer container = new ProjectileHitEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onProjectileLaunchEvent(ProjectileLaunchEvent event) {
        ProjectileLaunchEventContainer container = new ProjectileLaunchEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onSheepDyeWoolEvent(SheepDyeWoolEvent event) {
        SheepDyeWoolEventContainer container = new SheepDyeWoolEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onSheepRegrowWoolEvent(SheepRegrowWoolEvent event) {
        SheepRegrowWoolEventContainer container = new SheepRegrowWoolEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onSlimeSplitEvent(SlimeSplitEvent event) {
        SlimeSplitEventContainer container = new SlimeSplitEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVillagerAcquireTradeEvent(VillagerAcquireTradeEvent event) {
        VillagerAcquireTradeEventContainer container = new VillagerAcquireTradeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVillagerReplenishTradeEvent(VillagerReplenishTradeEvent event) {
        VillagerReplenishTradeEventContainer container = new VillagerReplenishTradeEventContainer(event);
        eventManager.fire(container);
    }

}
