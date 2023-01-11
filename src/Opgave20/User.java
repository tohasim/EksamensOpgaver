package Opgave20;

public class User implements DataObject{
    private int id;
    private String name;
    private String userName;

    public User(int id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public int getId(){
        return id;
    }

    public String[] getData() {
        return new String[]{"" + id, name, userName};
    }
}
