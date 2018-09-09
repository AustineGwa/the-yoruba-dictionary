package org.oruko.dictionary.events;

import java.time.LocalDateTime;

/**
 * Events published when a name is deleted from the system
 *
 * @author Dadepo Aderemi.
 */
public class WordDeletedEvent {
    private final String name;
    private final LocalDateTime timestamp;

    public WordDeletedEvent(String name) {
        this.name = name;
        this.timestamp = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
