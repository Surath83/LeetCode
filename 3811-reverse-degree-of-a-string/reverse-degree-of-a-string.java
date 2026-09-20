class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int a = 26 + 97 - (int) Character.toLowerCase(s.charAt(i));
            int p = (i+1) * a;
            sum += p;
        }
        return sum;
    }
}