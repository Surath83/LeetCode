class Solution {
     public static int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] dp = new int[max + 1];
        int m = dp.length;
        for (int i = 0; i < n; i++) {
            dp[nums[i]] += nums[i];
        }
        int prev1 = 0;
        int prev2 = 0;
        for (int i = 0; i < m; i++) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + dp[i]);
            prev2 = temp;
        }
        return prev1;
    }
}
