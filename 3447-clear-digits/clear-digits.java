class Solution {
    public String clearDigits(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder list = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!Character.isDigit(c)){
                s.push(c);
            }else{
                if(!s.isEmpty()){
                    s.pop();
                }
            }
        }
        while(!s.isEmpty()){
            list.append(s.pop());
        }
        list.reverse();
        return list.toString();
    }
}