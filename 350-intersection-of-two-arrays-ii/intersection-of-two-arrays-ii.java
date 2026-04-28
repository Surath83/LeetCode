class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int j : nums2){
            if(map.containsKey(j) && map.get(j)>0){
                list.add(j);
                map.put(j, map.get(j)-1);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        while(!list.isEmpty()){
            res[i++] = list.remove(0);
        }
        return res;
    }
}