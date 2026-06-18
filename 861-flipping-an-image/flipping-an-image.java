class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;

        int[][] res = new int[n][m];
        for(int i=0; i<n; i++){
            Stack<Integer> stack = new Stack<>();
            for(int j=0; j<m; j++){
                stack.push(image[i][j]);
            }
            for(int j=0; j<m; j++){
                int pr = stack.pop();
                if(pr == 0){
                    pr = 1;
                }else{
                    pr = 0;
                }
                res[i][j] = pr;
            }
        }
        return res;
    }
}