import java.util.Scanner;

public class palindromNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(num);
        
        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reversedNum = 0;
        while (x != 0) {
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }
        return originalNum == reversedNum;
    }
}
