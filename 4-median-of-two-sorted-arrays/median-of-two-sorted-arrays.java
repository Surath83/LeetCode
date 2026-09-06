class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int la = nums1.length;
        int lb = nums2.length;
        if(la==0 && lb==0) return 0;
        List<Integer> list = new ArrayList<>();
        for(int i: nums1) list.add(i);
        for(int i: nums2) list.add(i);
        Collections.sort(list);
        if(list.size() % 2 == 0){
            int a = (int)list.size()/2;
            int b = a-1;
            return (double)(list.get(a)+list.get(b))/2;
        }
        return (double)(list.get((int)(list.size()/2)));
    }
}