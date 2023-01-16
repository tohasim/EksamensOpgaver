package Opgaver.Opgave20;

public class Student implements DataObject{
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String[] getData() {
        return new String[]{"" + id, name, email};
    }
}
