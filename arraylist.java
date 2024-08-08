
import java.util.ArrayList;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
       
        System.out.println("numbers: " + num);

        if (num.contains(60)) {
            System.out.println("The list contains number 10.");
        }

        int indexToRemove = num.indexOf(30);
        if (indexToRemove != -1) {
            Integer removedNumber = num.remove(indexToRemove);
            System.out.println("Removed number: " + removedNumber);
        }

        System.out.println("numbers: " + num);

        num.set(1, 400);
        System.out.println("Numbers after modification: " + num);

        System.out.println("The size of the array: " + num.size());
    }
}
