package PrøveEksamener.PrøveEksamen1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent() {
    }

    public HogwartsStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
    }

    public void setHouse(String house) {
        ArrayList<String> houses = new ArrayList<>(List.of("gryffindor", "hufflepuff", "ravenclaw", "slytherin"));
        if (houses.contains(house.toLowerCase())){
            this.house = house;
        }else throw new InputMismatchException(house + " is not a house");
    }

    public ArrayList<HogwartsStudent> sortStudents(ArrayList<HogwartsStudent> unsortedStudents){
        unsortedStudents.sort(new studentSorter());
        return unsortedStudents;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "(" + lastName + ", " + firstName + ": " + house + ")";
    }

    //-----------------//

    public static void main(String[] args) {
        HogwartsStudent prog = new HogwartsStudent();
        HogwartsStudent student1 = new HogwartsStudent("Adam", "Hoppe", "Gryffindor");
        HogwartsStudent student2 = new HogwartsStudent("Sadek", "Alsukafi", "Ravenclaw");
        HogwartsStudent student3 = new HogwartsStudent("Simone", "Gottbrecht", "slytherin");
        HogwartsStudent student4 = new HogwartsStudent("Tore", "Simonsen", "Hufflepuff");
        ArrayList<HogwartsStudent> students = new ArrayList<>(List.of(student1, student2, student3, student4));
        System.out.println(students);

        students = prog.sortStudents(students);
        System.out.println(students);

        HogwartsStudent student5 = new HogwartsStudent("Skal", "Fejle", "FEJL HER");
        students.add(student5);

    }
}
