class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : nums){
            pq.offer(i);
        }
        int a = pq.poll();
        int b = pq.poll();
        return (a-1)*(b-1);
    }
}