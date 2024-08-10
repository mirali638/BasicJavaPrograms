// What is an Exception? Explain try, catch and finally with 
// example.
class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Attempted to divide by zero!");
    }
}
public class exceptionDemo {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            if(divisor==0){
                throw new DivideByZeroException();
            }
            double result = dividend/divisor;
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
