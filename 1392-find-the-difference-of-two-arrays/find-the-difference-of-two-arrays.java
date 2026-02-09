class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int j : nums2){
            set2.add(j);
        }
        for(int a : set1){
            if(!set2.contains(a)){
                diff1.add(a);
            }
        }
        for(int b : set2){
            if(!set1.contains(b)){
                diff2.add(b);
            }
        }
        return Arrays.asList(diff1,diff2);
    }
}