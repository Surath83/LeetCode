class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            list.add(nums[i]);
        }
        list.add(target);
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == target){
                return i;
            }
        }
        return 0;
    }
}