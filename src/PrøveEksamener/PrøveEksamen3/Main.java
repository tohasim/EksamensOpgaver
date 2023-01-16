package PrøveEksamener.PrøveEksamen3;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        users.addUser("User1", Role.Reader);
        users.addUser("User2", Role.Editor);
        users.addUser("User3", Role.Reader);
        users.addUser("User4", Role.Editor);
        users.addUser("User5", Role.Admin);

        System.out.println(users.getUsersByRole(Role.Admin));
    }
}
