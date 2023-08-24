package model;


import java.lang.reflect.Array;
import java.util.*;

public class Event {
    int id;
    String eventName;
    String prize_name;
    String date;
    Map<Integer, List<Integer>> EventBiddings;
    public Event(int id, String eventName, String prize_name, String date) {
        this.id = id;
        this.eventName = eventName;
        this.prize_name = prize_name;
        this.date = date;
        EventBiddings = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public Map<Integer, List<Integer>> getEventBiddings() {
        return EventBiddings;
    }
}
