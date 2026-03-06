class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0) return false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length && j<=i+k; j++){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}