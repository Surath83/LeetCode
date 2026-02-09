class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int a = 0;
        int b = a+k;
        double m = Integer.MIN_VALUE;

        while((a < (n-k)) || b == n){
            int sum = 0;
            for(int i=a; i<b; i++){
                sum += nums[i];
            }
            a++;
            b++;
            m = Math.max(m,sum);
        }
        return m /= k;
    }
};;