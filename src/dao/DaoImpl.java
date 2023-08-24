package dao;

import database.InMemoryDatabase;
import model.Event;
import model.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DaoImpl {

    public InMemoryDatabase db = InMemoryDatabase.getInstance();
    public void addMember(Member member){
        db.getMemberDB().put(member.getId(), member);
    }

    public void addEvent(Event event){
        db.getEventDB().put(event.getId(), event);
    }
    public Boolean doesMemberExist(Member member){
         if(db.getMemberDB().get(member.getId()) == null)
             return false;
         return true;
    }
    public void registerMember(int memberId, int eventId){
        db.getEventDB().get(eventId).getEventBiddings().put(memberId, new ArrayList<>());
    }

    public void submitBid(int memberId, int eventId, ArrayList<Integer> bidArray){
        db.getEventDB().get(eventId).getEventBiddings().put(memberId, bidArray);
    }

    public Integer getWinner(Integer eventId) {
        int ans = 10000; //maximum value
        int winnerMemberiD = 50;
        Set<Integer> allMemberId = db.getEventDB().get(eventId).getEventBiddings().keySet();

        for(Integer memberId: allMemberId) {
            List<Integer> list = db.getEventDB().get(eventId).getEventBiddings().get(memberId);

            for(Integer bid: list){

                if(bid < ans){
                    ans = bid;
                    winnerMemberiD = memberId;
                    System.out.println(memberId);
                }
            }
        }
        return winnerMemberiD;
    }
}
