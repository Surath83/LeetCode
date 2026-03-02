class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer m : map.keySet()){
            if(Objects.equals(map.get(m),1)){
                return m;
            }
        }
        return 0;
    }
}