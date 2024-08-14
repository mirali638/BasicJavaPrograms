public class stairCase {
    public class Solution {
        public static int climbStairs(int n) {
            if (n <= 1) return 1; // Base case: 1 way to climb 0 or 1 step
    
            int[] dp = new int[n + 1]; // Initialize an array to store the number of ways to reach each step
            dp[0] = 1; // 1 way to stay at the ground level (do nothing)
            dp[1] = 1; // 1 way to reach the first step (a single 1-step)
    
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2]; // Number of ways to reach step i
            }
    
            return dp[n]; // Return the number of ways to reach the nth step
        }
    
        public static void main(String[] args) {
            int n = 4; // Number of steps
            System.out.println(climbStairs(n)); // Output: 5
        }
    }
    
}
