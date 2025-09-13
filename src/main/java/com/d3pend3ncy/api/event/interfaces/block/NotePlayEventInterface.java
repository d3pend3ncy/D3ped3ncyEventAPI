package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.NotePlayEvent;

public interface NotePlayEventInterface extends Listener {
    void onNotePlayEvent(NotePlayEvent event);
}
