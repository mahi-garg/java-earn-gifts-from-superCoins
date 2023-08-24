package database;

import model.Event;
import model.Member;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

    Map<Integer, Member> memberDb;
    Map<Integer, Event> eventDb;

    private static final InMemoryDatabase instance = new InMemoryDatabase();

    private InMemoryDatabase(){
        memberDb = new HashMap<>();
        eventDb = new HashMap<>();
    }

    public Map<Integer, Member> getMemberDB(){
        return memberDb;
    }
    public Map<Integer, Event> getEventDB(){
        return eventDb;
    }

    public static InMemoryDatabase getInstance() {
        return instance;
    }
}
