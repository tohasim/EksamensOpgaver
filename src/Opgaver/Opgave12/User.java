package Opgaver.Opgave12;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User(String fullName) {
        this.fullName = fullName;
        createUserID();
    }

    public boolean validUserID(){
         return userID.matches("[a-å]{4}[0-9]{4}");
    }
    public void createUserID(){
        Random random = new Random();
        String firstName;
        String lastName;
        String generatedUserID = "";
        String[] nameArray = fullName.split(" ");
        firstName = nameArray[0];
        if (nameArray.length == 2)
            lastName = nameArray[1];
        else lastName = nameArray[2];
        generatedUserID += firstName.substring(0, 2);
        generatedUserID += lastName.substring(0, 2);
        generatedUserID += String.format("%04d", random.nextInt(0, 10000));
        userID = generatedUserID.toLowerCase();
        System.out.println("USERID: " + userID);
    }

    public static void main(String[] args) {
        User testUser = new User("Tore Hald Simonsen");
        System.out.println(testUser.validUserID());
    }
}
