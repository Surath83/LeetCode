class Solution {
    public int expand(String s, int l, int r){
        while(l>= 0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len == 0 && len == 1) return s;
        int start = 0;
        int end = 0;

        for(int i=0; i<len; i++){
            int oddlen = expand(s,i,i);
            int evenlen = expand(s,i,i+1);
            int maxlen = Math.max(oddlen, evenlen);

            if(maxlen > end-start+1){
                start = i-(maxlen-1)/2;
                end = i+maxlen/2;
            }
        }
        return s.substring(start, end+1);
    }
}