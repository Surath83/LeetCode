class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = n-1;
        go:
        for(int i=0;i<n;i++){
            if(nums[a]==0){
                swap(a,b,nums);
                continue go;
            }
            a++;
        }
    }
    public void swap(int a,int b,int[] nums){
        for(int i=a;i<b;i++){
            nums[i]=nums[i+1];
        }
        nums[b] = 0;
    }
}