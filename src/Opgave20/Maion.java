package Opgave20;

import java.util.ArrayList;
import java.util.List;

public class Maion {
    public static void main(String[] args){
        DataObject user1 = new User(001, "user1", "username1");
        DataObject user2 = new User(002, "user2", "username2");
        DataObject user3 = new User(003, "user3", "username3");
        DataObject user4 = new User(004, "user4", "username4");

        DataObject student1 = new Student(101, "student1", "stud1@stud.kea.dk");
        DataObject student2 = new Student(102, "student2", "stud2@stud.kea.dk");
        DataObject student3 = new Student(103, "student3", "stud3@stud.kea.dk");

        ArrayList<DataObject> objectList = new ArrayList<>(List.of(user1, user2, student1, user3, student2, user4, student3));
        for(DataObject object : objectList){
            for (String datum : object.getData()) {
                System.out.printf(datum + " ");
            }
            System.out.println();
        }
    }
}
