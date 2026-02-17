class Solution {
    public void checkPop(char a, char b, Deque<Character> stack){
        if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']')){
            stack.pop();
            return;
        }
        stack.push(b);
        return;
    }
    public boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1) return false;
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char b = s.charAt(i);
            if(!stack.isEmpty()){
                char a = stack.peek();
                checkPop(a,b,stack);
            }else{
                stack.push(b);
            }
        }
        if(stack.peek()==null){
            return true;
        }
        return false;
    }
}