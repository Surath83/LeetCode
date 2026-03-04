class Solution {
    public int special(int[][] mat, int a, int b){
        for(int i=0; i<mat.length; i++){
            if(i == a){
                continue;
            }
            if(mat[i][b] != 0){
                return 0;
            }
        }
        for(int j=0; j<mat[0].length; j++){
            if(j == b){
                continue;
            }
            if(mat[a][j] != 0){
                return 0;
            }
        }
        return 1;
    }
    public int numSpecial(int[][] mat) {
        int res = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    res += special(mat,i,j);
                }
            }
        }
        return res;
    }
}