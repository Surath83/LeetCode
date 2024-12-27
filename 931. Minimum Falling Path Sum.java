class Solution {
    public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = matrix[i][j];
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if ((j - 1) >= 0) {
                    if (dp[i + 1][j - 1] == Integer.MAX_VALUE) {
                        dp[i + 1][j - 1] = dp[i][j] + matrix[i + 1][j - 1];
                    } else {
                        dp[i + 1][j - 1] = Math.min(dp[i + 1][j - 1], dp[i][j] + matrix[i + 1][j - 1]);
                    }
                }
                if (j >= 0) {
                    if (dp[i + 1][j] == Integer.MAX_VALUE) {
                        dp[i + 1][j] = dp[i][j] + matrix[i + 1][j];
                    } else {
                        dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + matrix[i + 1][j]);
                    }
                }
                if (j + 1 < n) {
                    if (dp[i + 1][j + 1] == Integer.MAX_VALUE) {
                        dp[i + 1][j + 1] = dp[i][j] + matrix[i + 1][j + 1];
                    } else {
                        dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + matrix[i + 1][j + 1]);
                    }
                }
            }
        }
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minsum = Math.min(minsum, dp[m - 1][i]);
        }
        return minsum;
    }
}
