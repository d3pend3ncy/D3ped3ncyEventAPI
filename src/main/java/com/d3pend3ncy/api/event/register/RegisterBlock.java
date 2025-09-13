package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.*;
import com.d3pend3ncy.api.event.containers.block.*;

public class RegisterBlock implements Listener {

    public RegisterBlock() {}

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        BlockBreakEventContainer container = new BlockBreakEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockBurnEvent(BlockBurnEvent event) {
        BlockBurnEventContainer container = new BlockBurnEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockDamageEvent(BlockDamageEvent event) {
        BlockDamageEventContainer container = new BlockDamageEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockDispenseArmorEvent(BlockDispenseArmorEvent event) {
        BlockDispenseArmorEventContainer container = new BlockDispenseArmorEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockDispenseEvent(BlockDispenseEvent event) {
        BlockDispenseEventContainer container = new BlockDispenseEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockExpEvent(BlockExpEvent event) {
        BlockExpEventContainer container = new BlockExpEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockExplodeEvent(BlockExplodeEvent event) {
        BlockExplodeEventContainer container = new BlockExplodeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockFadeEvent(BlockFadeEvent event) {
        BlockFadeEventContainer container = new BlockFadeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockFertilizeEvent(BlockFertilizeEvent event) {
        BlockFertilizeEventContainer container = new BlockFertilizeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockFormEvent(BlockFormEvent event) {
        BlockFormEventContainer container = new BlockFormEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockFromToEvent(BlockFromToEvent event) {
        BlockFromToEventContainer container = new BlockFromToEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockGrowEvent(BlockGrowEvent event) {
        BlockGrowEventContainer container = new BlockGrowEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockIgniteEvent(BlockIgniteEvent event) {
        BlockIgniteEventContainer container = new BlockIgniteEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockMultiPlaceEvent(BlockMultiPlaceEvent event) {
        BlockMultiPlaceEventContainer container = new BlockMultiPlaceEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockPistonExtendEvent(BlockPistonExtendEvent event) {
        BlockPistonExtendEventContainer container = new BlockPistonExtendEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockPistonRetractEvent(BlockPistonRetractEvent event) {
        BlockPistonRetractEventContainer container = new BlockPistonRetractEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockPlaceEvent(BlockPlaceEvent event) {
        BlockPlaceEventContainer container = new BlockPlaceEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockRedstoneEvent(BlockRedstoneEvent event) {
        BlockRedstoneEventContainer container = new BlockRedstoneEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onBlockSpreadEvent(BlockSpreadEvent event) {
        BlockSpreadEventContainer container = new BlockSpreadEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onCauldronLevelChange(CauldronLevelChangeEvent event) {
        CauldronLevelChangeContainer container = new CauldronLevelChangeContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onEntityBlockFormEvent(EntityBlockFormEvent event) {
        EntityBlockFormEventContainer container = new EntityBlockFormEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onLeavesDecayEvent(LeavesDecayEvent event) {
        LeavesDecayEventContainer container = new LeavesDecayEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onMoistureChangeEvent(MoistureChangeEvent event) {
        MoistureChangeEventContainer container = new MoistureChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onNotePlayEvent(NotePlayEvent event) {
        NotePlayEventContainer container = new NotePlayEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onSignChangeEvent(SignChangeEvent event) {
        SignChangeEventContainer container = new SignChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onSpongeAbsorbEvent(SpongeAbsorbEvent event) {
        SpongeAbsorbEventContainer container = new SpongeAbsorbEventContainer(event);
        eventManager.fire(container);
    }

}
