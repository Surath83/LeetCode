class Solution {
    public boolean check(int i, String[] strs){
        char a = strs[0].charAt(i);
        for(String str : strs){
            if(a != str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        if(strs.length == 0) return str.toString();
        int maxx = Integer.MAX_VALUE;
        for(String a : strs){
            maxx = Math.min(maxx, a.length());
        }
        for(int i=0; i<maxx; i++){
            if(check(i, strs)){
                str.append(strs[0].charAt(i));
            }else{
                return str.toString();
            }
        }
        return str.toString();
    }
}