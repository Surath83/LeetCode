class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int n = s.length();
        int a = 0;
        int b = n-1;
        while(a<b){
            if(a<n && b>-1 && isVowel(a,str) && isVowel(b,str)){
                char temp = str.charAt(a);
                str.setCharAt(a,str.charAt(b));
                str.setCharAt(b,temp);
                a++;
                b--;
            }
            if(!isVowel(a,str)){
                a++;
            }
            if(!isVowel(b,str)){
                b--;
            }
        }
        return str.toString();
    }
    public boolean isVowel(int a,StringBuilder s){
        char b = Character.toLowerCase(s.charAt(a));
        if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){
            return true;
        }
        return false;
    }
}