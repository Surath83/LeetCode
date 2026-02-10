class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = 0;
        int b = 0;
        int n = s.length();
        while(a<s.length()){
            for(int i=b;i<t.length();i++){
                if(t.charAt(i)==s.charAt(a)){
                    b++;
                    n--;
                    break;
                }
                b++;
            }
            a++;
        }
        if(n==0) return true;
        return false;
    }
}