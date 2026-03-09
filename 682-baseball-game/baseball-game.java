class Solution {
    public void operation(Stack<Integer> s, String x){
        if(x.equals("+")){
            int a = !s.isEmpty() ? s.pop() : 0;
            int b = !s.isEmpty() ? s.pop() : 0;
            s.push(b);
            s.push(a);
            s.push(a+b);
        }else if(x.equals("C")){
            if(!s.isEmpty()){
                s.pop();
            }
        }else if(x.equals("D")){
            if(!s.isEmpty()){
                s.push(2*s.peek());
            }
        }else{
            s.push(Integer.parseInt(x));
        }
    }
    public int calPoints(String[] operations) {
        if(operations.length == 0) return 0;
        Stack<Integer> s = new Stack<>();
        for(String p : operations){
            operation(s,p);
        } 
        int res = 0;
        while(!s.isEmpty()){
            res += s.pop();
        }
        return res;
    }
}