class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++){
                int com = -nums[i] - nums[j];
                if(seen.contains(com)){
                    List<Integer> tri = Arrays.asList(nums[i], nums[j], com);
                    Collections.sort(tri);
                    result.add(tri);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}