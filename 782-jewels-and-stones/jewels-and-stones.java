class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(char a : jewels.toCharArray()){
            set.add(a);
        }
        int count = 0;
        for(char b : stones.toCharArray()){
            if(set.contains(b)){
                count++;
            }
        }
        return count;
    }
}