class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> str = new ArrayList<>();
        int maxval = Integer.MIN_VALUE;
        for(int i : candies)
            maxval = Math.max(maxval,i);
        for(int i = 0; i<candies.length; i++){
            int a = candies[i]+extraCandies;
            if(a >= maxval){
                str.add(true);
                continue;
            }
            str.add(false);
        }
        return str;
    }
}