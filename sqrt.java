public class sqrt {
    public static void main(String[] args) {
        System.out.println(Solution.mySqrt(4)); // Output: 2
    }
}
class Solution {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;
            if (midSquared == x) return mid;
            else if (midSquared < x) left = mid + 1;
            else right = mid - 1;
        }  
        return right;
    }
}
