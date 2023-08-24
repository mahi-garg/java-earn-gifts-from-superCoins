import service.EventService;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static <List> void main(String[] args) {
        System.out.println("--------------");

        EventService eventService= new EventService();
        eventService.addMember(1, "akshay", 1000);
        eventService.addMember(2, "mahi", 5000);
        eventService.addMember(3, "saki", 2000);

        eventService.addEvent(1, "BBD", "IPHONE-14", "2023-06-06" );

        eventService.registerMember( 1, 1);
        eventService.registerMember( 2, 1);
        eventService.registerMember( 3, 1);

        ArrayList<Integer> bidArray1 = new ArrayList<Integer>();
        bidArray1.add(200);
        bidArray1.add(20);
        bidArray1.add(400);

        ArrayList<Integer> bidArray2 = new ArrayList<Integer>();
        bidArray2.add(1000);
        bidArray2.add(200);
        bidArray2.add(3000);

        ArrayList<Integer> bidArray3 = new ArrayList<Integer>();
        bidArray3.add(1);
        bidArray3.add(2000);
        bidArray3.add(300);

        eventService.submitBid(1,1,bidArray1);
        eventService.submitBid(2,1,bidArray2);
        eventService.submitBid(3,1,bidArray3);
        eventService.getWinner(1);

    }
}