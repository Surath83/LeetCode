class Solution {
    public boolean check(int[] nums) {
        int x[] = new int[nums.length];
        for(int f=0; f<nums.length; f++){
            x[f] = nums[f];
        }
        Arrays.sort(x);
        for(int i=0; i<nums.length; i++){
            int j = i;
            int arr[] = new int[nums.length];
            for(int count=0; count<nums.length; count++){
                if(j>=nums.length){
                    j = j%nums.length;
                }
                arr[count] = nums[j];
                j++;
            }
            for(int k=0; k<nums.length; k++){
                if(arr[k] == x[k]){
                    if(k == nums.length-1){
                        return true;
                    }
                    continue;
                }else{
                    break;
                }
            }
        }
        return false;
    }
}