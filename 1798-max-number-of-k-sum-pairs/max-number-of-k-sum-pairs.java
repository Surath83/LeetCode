class Solution {
    public int maxOperations(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1) return 0;
        int count = 0;
        int n = nums.length;
        int a = 0;
        int b = n-1;
        Arrays.sort(nums);
        while(a<b){
            if((nums[a]+nums[b]) > k ){
                b--;
            }else if((nums[a]+nums[b]) < k){
                a++;
            }else{
                count++;
                a++;
                b--;
            }
        }
        return count;
    }
}