package com.epam.sprint.core.logger;

import com.epam.sprint.core.entity.Event;

import javafx.beans.binding.StringBinding;

import java.util.List;

/**
 * @author Denys_Uzhvii
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName, int cacheSize) {
        super(fileName);
        this.cacheSize = cacheSize;
    }

    @Override
    public void logEvent(Event event) {
        if (cache.size() < cacheSize) {
            cache.add(event);
        } else {
            flushCache();
        }
    }

    private void flushCache() {
        cache.forEach(super::logEvent);
        cache.clear();
    }

    public void destroy() {
        flushCache();
    }


}
