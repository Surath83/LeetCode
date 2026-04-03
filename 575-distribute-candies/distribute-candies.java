class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int res = candyType.length/2;
        for(int i : candyType){
            set.add(i);
        }
        int a = set.size();
        return Math.min(res,a);
    }
}