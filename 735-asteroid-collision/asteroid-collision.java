class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        if(n == 0 || n == 1) return asteroids;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<n; i++){
            if(s.isEmpty()){
                s.push(asteroids[i]);
                continue;
            }
            if(s.peek() > 0 && asteroids[i] < 0){
                if(Math.abs(s.peek()) == Math.abs(asteroids[i])){
                    s.pop();
                }else if(Math.abs(s.peek()) < Math.abs(asteroids[i])){
                    s.pop();
                    i--;
                }
            }else{
                s.push(asteroids[i]);
            }
        }
        int[] arr = new int[s.size()];
        int i = arr.length-1;
        while(!s.isEmpty()){
            arr[i] = s.pop();
            i--;
        }
        return arr;
    }
}