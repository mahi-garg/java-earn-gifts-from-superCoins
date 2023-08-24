package model;

public class Member {

    public int id;
    public String name;
    public int superCoin;

    public Member(int id, String name, int superCoin) {
        this.id = id;
        this.name = name;
        this.superCoin = superCoin;
    }

    public int getId() {
        return id;
    }
}
