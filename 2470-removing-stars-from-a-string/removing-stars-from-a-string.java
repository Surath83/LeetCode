class Solution {
    public String removeStars(String s) {
        if(s.length() == 0 ) return null;
        Stack<Character> st = new Stack<>();
        int size=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                if(!st.isEmpty()){
                    st.pop();
                    size--;
                }
            }else{
                st.push(s.charAt(i));
                size++;
            }
        }
        StringBuilder r = new StringBuilder(size);
        while(!st.isEmpty()){
            r.append(st.pop());
        }
        return r.reverse().toString();

    }
}