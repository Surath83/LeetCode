class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;
        for(int j=1; j<n-1; j++){
            int left = nums[j]-diff;
            int right = nums[j]+diff;
            int i=0;
            int k = j+1;
            while(i<j && nums[i]<left){
                i++;
            }
            while(k<n && nums[k]<right){
                k++;
            }
            if(i<j && k<n && nums[i]==left && nums[k]==right){
                count++;
            }
        }
        return count;
    }
}