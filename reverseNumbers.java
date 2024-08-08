import java.util.Scanner;

public class reverseNumbers {
    
    public static void reverseNumbers(double[] numbers) 
      {
        int left = 0;
        int right = numbers.length - 1;

         while (left < right) 
          {
            double temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
          }
       }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        reverseNumbers(numbers); 
             
        System.out.println("\nReversed numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
}