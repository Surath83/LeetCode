class Solution {
    public static int recdp(int n,int[] cost,int[] dp){
            if(n<0) {
                return 0;
            }
            if(n == 0 || n == 1){
                dp[n] = cost[n];
                return dp[n];
            }
            if(dp[n] != Integer.MAX_VALUE){
                return dp[n];
            }
            return dp[n] = cost[n] + Math.min((recdp(n-1,cost, dp)),(recdp(n-2,cost,dp)));
                     
    }
    public static int minCostClimbingStairs(int[] cost) {
        int m = cost.length+1;
            int[] dp = new int[m];
            Arrays.fill(dp, Integer.MAX_VALUE);
            int res1 =  recdp(m-2,cost,dp);
            int res2 =  recdp(m-3,cost,dp);
            dp[dp.length-1] =  Math.min(res1,res2);
            return dp[dp.length-1];
    }
}
