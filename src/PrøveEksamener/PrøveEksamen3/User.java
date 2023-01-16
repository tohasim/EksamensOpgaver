package PrøveEksamener.PrøveEksamen3;

import java.util.ArrayList;

public class User {
    String username;
    int userId;
    Role role;

    public User(String username, Role role){
        this.username = username;
        this.role = role;
    }

    @Override
    public String toString() {
        return username;
    }

    public void setUserId(int UserId) {
        userId = userId;
    }
}
