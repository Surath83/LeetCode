class Solution {
    public int alter(String s, String str){
        if(s.equals(str)) return 0;
        int min = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != str.charAt(i)){
                min++;
            }
        }
        return min;
    }
    public int minOperations(String s) {
        int len = s.length();
        if(len == 0) return 0;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        a.append(0);
        b.append(1);
        for(int i=1; i<len; i++){
            char ch;
            char lastChar = a.charAt(a.length()-1);
            if(lastChar == '0'){
                ch = '1';
            }else{
                ch = '0';
            }
            a.append(ch);
            b.append(lastChar);
        }
        return Math.min(alter(s,a.toString()),alter(s,b.toString()));
    }
}