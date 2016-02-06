package com.epam.sprint.core.logger;

import com.epam.sprint.core.entity.Event;
import com.epam.sprint.core.logger.EventLogger;

/**
 * @author Denys_Uzhvii
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(event);
    }
}
