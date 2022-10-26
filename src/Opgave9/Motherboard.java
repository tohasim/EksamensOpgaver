package Opgave9;

import java.util.ArrayList;

public class Motherboard {
    SataDrive[] sataDrives = new SataDrive[4];

    private void printDrives(){
        for (SataDrive drive: sataDrives) {
            System.out.println(drive);
        }
    }

    private boolean addDrive(SataDrive drive) {
        for (int i = 0; i < sataDrives.length; i++) {
            if (sataDrives[i] == null){
                sataDrives[i] = drive;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();
        ArrayList<SataDrive> drives = new ArrayList<>();
        SataDrive drive1 = new SataDrive("Drive1");
        SataDrive drive2 = new SataDrive("Drive2");
        SataDrive drive3 = new SataDrive("Drive3");
        SataDrive drive4 = new SataDrive("Drive4");
        SataDrive drive5 = new SataDrive("Drive5");
        drives.add(drive1);
        drives.add(drive2);
        drives.add(drive3);
        drives.add(drive4);
        drives.add(drive5);
        for (SataDrive drive: drives) {
            if (motherboard.addDrive(drive))
                System.out.printf("%s added\n", drive.name);
            else
                System.out.printf("%s not added\n", drive.name);
        }
        motherboard.printDrives();
    }

}
