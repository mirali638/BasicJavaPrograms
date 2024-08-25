// Write a program to make calculator that accepts input from commandline? 
// Use java’s exception handling mechanism to handle abnormal situation?

//Write a java program that evaluates a math expression given in string 
//form from command line arguments.
public class exam16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java exam16 <number1> <operator> <number2>");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);

            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            System.out.println("The result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
