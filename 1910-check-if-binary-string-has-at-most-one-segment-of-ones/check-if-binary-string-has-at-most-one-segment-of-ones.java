class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 0) return false;
        boolean res = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                res = true;
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(j) == '1' && s.charAt(j-1) == '0'){
                        return res = false;
                    }
                }
            }
            
        }
        return res;
    }
}