class plus{
public int[] plusOne(int[] digits) {
    int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    int[] newDigits = new int[n + 1];
    newDigits[0] = 1; 
    return newDigits;
}}
public class plusOne {
    public static void main(String[] args) {
        plus p = new plus();
        int[] digits = {1, 2, 9};
        int[] result = p.plusOne(digits);
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}