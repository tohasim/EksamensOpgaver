package PrøveEksamener.PrøveEksamen3;

import java.util.ArrayList;
import java.util.Random;

public class Users {
    private ArrayList<User> users = new ArrayList<>();

    public void addUser(String username, Role role){
        User user = new User(username, role);
        user.setUserId(generateUserId());
        users.add(user);
    }

    public ArrayList<User> getUsersByRole(Role role){
        ArrayList returnList = new ArrayList<>();
        for (User user : users) {
            if(user.role == role){
                returnList.add(user);
            }
        }
        return returnList;
    }

    private int generateUserId() {
        int id = 0;
        Random rng = new Random();
        boolean idFound = false;
        while(!idFound) {
            id = rng.nextInt(1000, 10000);
            idFound = true;
            for (User user : users) {
                if (user.userId == id)
                    idFound = false;
            }
        }
        return id;
    }
}
