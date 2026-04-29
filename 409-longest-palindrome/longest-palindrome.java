class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char a : s.toCharArray()){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        int len = 0;
        int count = 1;
        if(map.size() == 1){
            return s.length();
        }
        for(int i : map.values()){
            if(i >= 2){
                int x = (int)i/2*2;
                len += x;
                i -= x;
            }
            if(i == 1 && count == 1){
                len += 1;
                count--;
            }
        }
        return len;
    }
}