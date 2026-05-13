class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int res[] = new int[2];
        for(int i=0; i<len; i++){
            map.put(i+1,0);
        }
        for(int i=0; i<len; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() >= 2){
                res[0] = entry.getKey();
            }else if(entry.getValue() == 0){
                res[1] = entry.getKey();
            }
        }
        return res;
    }
}