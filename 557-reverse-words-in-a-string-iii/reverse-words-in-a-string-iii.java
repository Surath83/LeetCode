class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String i : str){
            StringBuilder a = new StringBuilder(i);
            a.reverse();
            res.append(a);
            if(i != str[str.length-1]){
                res.append(" ");
            }
        }
        return res.toString();
    }
}