package com.epam.sprint.core.logger;

import com.epam.sprint.core.entity.Event;

/**
 * @author Denys_Uzhvii
 */
public interface EventLogger {

    public void logEvent(Event event);
}
