class Solution {
    public void reverseString(char[] s) {
        if(s.length == 1 || s.length == 0) return;
        int j = s.length-1;
        int i = 0;
        while(i<j){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}