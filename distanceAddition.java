import java.util.Scanner;

class DM {
    private int meters;
    private int centimeters;

    public DM(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    public int getMeters() {
        return meters;
    }

    public int getCentimeters() {
        return centimeters;
    }
}

class DB {
    private int feet;
    private int inches;

    public DB(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }
}

public class distanceAddition {
    public static void main(String[] args) {
      
        DM dm = new DM(10,4);

        DB db = new DB(3,2);

        // Adding DM and DB objects
        int totalMeters = dm.getMeters() + (int) ((dm.getCentimeters() + db.getInches() * 2.54) / 100);
        int totalCentimeters = (dm.getCentimeters() + (int) (db.getInches() * 2.54)) % 100;

        System.out.println("Total distance in meters: " + totalMeters);
        System.out.println("Total distance in centimeters: " + totalCentimeters);

    }
}