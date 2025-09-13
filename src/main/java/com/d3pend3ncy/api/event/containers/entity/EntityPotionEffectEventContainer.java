package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityPotionEffectEventInterface;
import org.bukkit.event.entity.EntityPotionEffectEvent;

public class EntityPotionEffectEventContainer extends ContainerEvent<EntityPotionEffectEventInterface, EntityPotionEffectEvent> {

    public EntityPotionEffectEventContainer(EntityPotionEffectEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityPotionEffectEventInterface listener, EntityPotionEffectEvent event) {
        listener.onEntityPotionEffectEvent(event);
    }

    @Override
    public Class<EntityPotionEffectEventInterface> getListenerType() {
        return EntityPotionEffectEventInterface.class;
    }
}
