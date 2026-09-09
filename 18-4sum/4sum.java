class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int m = nums.length;
        if(m < 4) return res;
        Arrays.sort(nums);
        for(int i=0; i<m-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
                for(int j=i+1; j<m-2; j++){
                    if(j>i+1 && nums[j]==nums[j-1]) continue;
                        int a = j+1;
                        int b = m-1;
                        while(a<b){
                            long sum =(long) nums[i]+nums[j]+nums[a]+nums[b];
                            if(sum == target){
                                res.add(Arrays.asList(nums[i], nums[j], nums[a], nums[b]));
                                while (a < b && nums[a] == nums[a + 1]) a++;
                                while (a < b && nums[b] == nums[b - 1]) b--;
                                a++;
                                b--;
                            }else if(sum < target){
                                a++;
                            }else{
                                b--;
                            }
                        }
                }
            
        }
        return res;
    }
}