package com.epam.sprint.core;

import com.epam.sprint.core.entity.Client;
import com.epam.sprint.core.entity.Event;
import com.epam.sprint.core.logger.EventLogger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Denys_Uzhvii
 */
public class App {

    private Client client;
    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(client.getId().toString(), client.getFullName());
        Event e = new Event(new Date(), new SimpleDateFormat());
        e.setMsg(message);
        eventLogger.logEvent(e);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext
                ctx =
                new ClassPathXmlApplicationContext("spring-context.xml"); //shutdown hook
        App app = (App) ctx.getBean("app");
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");
        ctx.close();
    }

}
