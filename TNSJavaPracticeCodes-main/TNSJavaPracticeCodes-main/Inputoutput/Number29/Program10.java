public class ClimbingStairs {
    
    // Function to calculate the number of distinct ways to reach the top
    public static int climbStairs(int n) {
        // Base cases
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        // Array to store the number of ways to reach each step
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // Fill the dp array using the relation dp[i] = dp[i-1] + dp[i-2]
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // The number of ways to reach the nth step is stored in dp[n]
        return dp[n];
    }

    // Main function to test the climbStairs function
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Number of ways to climb to the top: " + climbStairs(n));
    }
}

