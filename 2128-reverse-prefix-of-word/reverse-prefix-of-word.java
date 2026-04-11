class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int count = 0;
        for(int i=0; i<word.length(); i++){
            char a = word.charAt(i);
            if(a == ch){
                str1.append(a);
                count = i;
                break;
            }else if(i == word.length()-1){
                str1.append(a);
                return str1.toString();
            }else{
                str1.append(a);
            }
        }
        str1.reverse();
        for(int j=count+1; j<word.length(); j++){
            str2.append(word.charAt(j));
        }
        return new StringBuilder().append(str1).append(str2).toString();
    }
}