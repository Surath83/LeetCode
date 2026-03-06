class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0 || haystack.length() == 0) return -1;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int k = i;
                for(int j=0; j<needle.length() && k<haystack.length(); j++){
                    if(haystack.charAt(k) != needle.charAt(j)){
                        break;
                    }else if(j == needle.length()-1 && (haystack.charAt(k) == needle.charAt(j))){
                        return i;
                    }
                    k++;
                }
            }
        }
        return -1;
    }
}