class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1) return 0;
        int dp[] = new int [n];
        Arrays.fill(dp,0);
        for(int i=1;i<n;i++){
            int jump = nums[i-1];
            int val = dp[i-1];
            int j=i;
            if(jump>0){
                while(jump!=0 && j<n){
                    if(dp[j]==0){
                        dp[j]=val+1;
                    }else{
                        dp[j] = Math.min(dp[j], val+1);
                    }
                    j++;
                    jump--;
                }
            }
        }
        return dp[n-1];





        // int dp[][] = new int [n][n];
        // for(int i=0; i<n; i++){
        //     dp[0][i] = 0;
        // }
        // for(int i=0; i<n; i++){
        //     dp[i][0] = 0;
        // }
        // for(int i=1; i<n; i++){
        //     for(int j=1; j<n; j++){
        //         if(j<i){
        //             dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        //         }
        //         int diag = dp[i-1][j-1];
        //         int val = nums[i-1];
        //         int z = j;
        //         while(z>=i && val>0 && z<n){
        //             int b = Math.max(dp[i-1][j],dp[i][j-1]);
        //             dp[i][z] = Math.min(diag+1,b);
        //             z++;
        //             val--;
        //         }
        //     }
        // }


        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }

        // int res = Integer.MAX_VALUE;
        // for(int i=1; i<n; i++){
        //     if(dp[i][n-1] != 0){
        //         res = Math.min(res,dp[i][n-1]);
        //     }
        // }
        // return res;

    }
}