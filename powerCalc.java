public class powerCalc {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }

       
        int x, y;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Both x and y must be integers.");
            return;
        }

        // Handle cases where x or y is negative
        if (x < 0 || y < 0) {
            System.out.println("Invalid input: Both x and y must be non-negative integers.");
            return;
        }

        long result = computePower(x, y);
        System.out.println(x + "^" + y + " = " + result);
    }

    // Method to compute x^y using repetitive multiplication
    public static long computePower(int x, int y) {
        long result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
