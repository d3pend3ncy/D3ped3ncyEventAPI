package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.*;
import com.d3pend3ncy.api.event.containers.inventory.*;

public class RegisterInventory implements Listener {

    public RegisterInventory() {}

    @EventHandler
    public void onBrewEvent(BrewEvent event) {
        BrewEventContainer container = new BrewEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBrewingStandFuelEvent(BrewingStandFuelEvent event) {
        BrewingStandFuelEventContainer container = new BrewingStandFuelEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onCraftItemEvent(CraftItemEvent event) {
        CraftItemEventContainer container = new CraftItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onFurnaceBurnEvent(FurnaceBurnEvent event) {
        FurnaceBurnEventContainer container = new FurnaceBurnEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onFurnaceExtractEvent(FurnaceExtractEvent event) {
        FurnaceExtractEventContainer container = new FurnaceExtractEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onFurnaceSmeltEvent(FurnaceSmeltEvent event) {
        FurnaceSmeltEventContainer container = new FurnaceSmeltEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        InventoryClickEventContainer container = new InventoryClickEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryCloseEvent(InventoryCloseEvent event) {
        InventoryCloseEventContainer container = new InventoryCloseEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryCreativeEvent(InventoryCreativeEvent event) {
        InventoryCreativeEventContainer container = new InventoryCreativeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryDragEvent(InventoryDragEvent event) {
        InventoryDragEventContainer container = new InventoryDragEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryMoveItemEvent(InventoryMoveItemEvent event) {
        InventoryMoveItemEventContainer container = new InventoryMoveItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryOpenEvent(InventoryOpenEvent event) {
        InventoryOpenEventContainer container = new InventoryOpenEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onInventoryPickupItemEvent(InventoryPickupItemEvent event) {
        InventoryPickupItemEventContainer container = new InventoryPickupItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPrepareAnvilEvent(PrepareAnvilEvent event) {
        PrepareAnvilEventContainer container = new PrepareAnvilEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPrepareItemCraftEvent(PrepareItemCraftEvent event) {
        PrepareItemCraftEventContainer container = new PrepareItemCraftEventContainer(event);
        eventManager.fire(container);
    }

}
