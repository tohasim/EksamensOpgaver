package Opgave7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names (String name){
        String[] nameArray = name.split(" ");
        firstName = nameArray[0];
        if (nameArray.length == 2){
            lastName = nameArray[1];
        } else if (nameArray.length == 3) {
            middleName = nameArray[1];
            lastName = nameArray[2];
        }
    }

    public String toString(){
        String name = firstName;
        if (middleName != null)
            name += " " + middleName;
        name += " " + lastName;
        return name;
    }

    public static void main(String[] args){
        Names toreName = new Names("Tore Hald Simonsen");
        Names esbenName = new Names("Esben Simonsen");

        System.out.println(toreName);
        System.out.println(esbenName);
    }
}
