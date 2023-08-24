package service;
import dao.DaoImpl;
import model.Event;
import model.Member;
import java.util.ArrayList;
public class EventService {
    DaoImpl dao= new DaoImpl();
    public void addMember(int id, String name, int superCoin ){
        Member member = new Member(id, name, superCoin);

        if(dao.doesMemberExist(member)){
            System.out.println("member already exist");
            return;
        }
        dao.addMember(member);
        System.out.println("member added");
    }

    public void addEvent(int id, String eventName, String prize_name, String date ){

        Event event = new Event(id, eventName, prize_name, date);
        //TODO: check if event already exist
        dao.addEvent(event);
        System.out.println("event added");
    }

    public void registerMember(int memberId, int eventId){
        //TODO: check if event amd member already exist
        dao.registerMember(memberId, eventId);
        System.out.println("MEMBER REGISTERED");
    }

    public void submitBid(int memberId, int eventId, ArrayList<Integer> bidArray ){

        dao.submitBid(memberId, eventId, bidArray);
        System.out.println("Bid submitted");

        int maximumBid = 0;
        for(Integer bid:bidArray){
            if(bid > maximumBid){
                maximumBid=bid;
            }
        }
    }
    public void getWinner(Integer eventId){
        System.out.println("WINNER " + dao.getWinner(eventId));
    }
}
