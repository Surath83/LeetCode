class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> p = new HashMap<>();
        Map<Integer, Integer> q = new HashMap<>();
        for(int i : nums1){
            p.put(i,p.getOrDefault(i,0)+1);
        }
        for(int i : nums2){
            q.put(i,q.getOrDefault(i,0)+1);
        }
        Set<Integer> set = new HashSet<>(p.keySet());
        set.retainAll(q.keySet());
        int arr[] = new int[set.size()];
        int count = 0;
        for(int i : set){
            arr[count] = i;
            count++;
        }
        return arr;
    }
}