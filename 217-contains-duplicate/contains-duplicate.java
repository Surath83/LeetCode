class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            if(mp.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}