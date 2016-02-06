package com.epam.sprint.core.entity;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Denys_Uzhvii
 */
public class Event {

    private int id;
    private String msg;
    private Date date;
    private final DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
        this.id = new Random().nextInt();
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
               "id=" + id +
               ", msg='" + msg + '\'' +
               ", date=" + df.format(date)+
               '}';
    }
}
