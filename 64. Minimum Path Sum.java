class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int right = j + 1;
                int down = i + 1;
                if (right < n && down < m) {
                    dp[i][right] = Math.min(dp[i][right], dp[i][j] + grid[i][right]);
                    dp[down][j] = Math.min(dp[down][j], dp[i][j] + grid[down][j]);
                } else if (right < n) {
                    dp[i][right] = Math.min(dp[i][right], dp[i][j] + grid[i][right]);
                } else if (down < m) {
                    dp[down][j] = Math.min(dp[down][j], dp[i][j] + grid[down][j]);
                } else {

                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
