class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int n = nums.length;
        // int a = 0;
        // int b = a+k;
        // double m = Integer.MIN_VALUE;

        // while((a < (n-k)) || b == n){
        //     int sum = 0;
        //     for(int i=a; i<b; i++){
        //         sum += nums[i];
        //     }
        //     a++;
        //     b++;
        //     m = Math.max(m,sum);
        // }
        // return m /= k;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxwin = sum;
        int n = nums.length;
        for(int j=k; j<n; j++){
            sum += nums[j];
            sum -= nums[j-k];
            maxwin = Math.max(maxwin,sum);
        }
        return (double) maxwin/k;
    }
};;