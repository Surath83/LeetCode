class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int size = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                while(i>=0){
                    if(s.charAt(i) != ' '){
                        size++;
                        i--;
                    }else{
                        return size;
                    }
                }
            }
        }
        return size;
    }
}