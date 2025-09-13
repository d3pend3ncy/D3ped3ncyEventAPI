package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.NotePlayEventInterface;
import org.bukkit.event.block.NotePlayEvent;

public class NotePlayEventContainer extends ContainerEvent<NotePlayEventInterface, NotePlayEvent> {

    public NotePlayEventContainer(NotePlayEvent event) {
        super(event);
    }

    @Override
    protected void call(NotePlayEventInterface listener, NotePlayEvent event) {
        listener.onNotePlayEvent(event);
    }

    @Override
    public Class<NotePlayEventInterface> getListenerType() {
        return NotePlayEventInterface.class;
    }
}
