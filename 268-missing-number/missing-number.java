class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<len; i++){
            mp.put(i,0);
        }
        for(int a : nums){
            mp.put(a, mp.getOrDefault(a,0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 0){
                return entry.getKey();
            }
        }
        return len;
    }
}