class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int m = 1;
        // int q = -1;
        // for(int i : nums){
        //     if(i==0){
        //         q=1;
        //         continue;
        //     } 
        //     m *= i;
        // }
        // if(q==1){
        //     for(int i=0;i<nums.length;i++){
        //        if(nums[i]!=0){
        //         nums[i]=0;
        //        }else{
        //          nums[i]=m;
        //        }
        //     }
        //     return nums;
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = m/nums[i];
        // }
        // return nums;
        int res[] = new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i] = res[i-1]*nums[i-1];
        }    
        int right=1;
        for(int j=nums.length-1;j>=0;j--){
            res[j] *= right;
            right *= nums[j];
        }
        return res;
    }
}