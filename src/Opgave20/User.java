package Opgave20;

import java.util.Random;

public class User implements DataObject{
    private int id;
    private String name;
    private String userName;

    public User(int id, String name, String userName) {
        this.id = id;
        this.name = name;
    }

    public String getUserName() {
        Random random = new Random();
        return name + String.format("%04d", random.nextInt(9999));
    }

    public int getId(){
        return id;
    }

    public String[] getData() {
        return new String[]{"" + id, name, getUserName()};
    }
}
