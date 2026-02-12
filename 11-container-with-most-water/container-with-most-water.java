class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(n == 0 || n == 1) return 0;
        int maxarea = Integer.MIN_VALUE;
        int a = 0;
        int b = n-1;
        while(a<b){
            int p = height[a];
            int q = height[b];
            int len = Math.min(p,q);
            maxarea = Math.max(maxarea, (len*(b-a)));
            if(p<q){
                a++;
            }else if(p==q){
                a++;
                b--;
            }else{
                b--;
            }
        }
        return maxarea;
    }
}