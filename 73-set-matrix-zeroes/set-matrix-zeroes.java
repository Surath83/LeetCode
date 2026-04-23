class Solution {
    public void fix(int[][] matrix, int a, int b){
        for(int i=0; i<matrix.length; i++){
            matrix[i][b] = 0;
        }
        for(int j=0; j<matrix[0].length; j++){
            matrix[a][j] = 0;
        }
        return;
    }
    public void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    list.add(new int[]{i,j});
                }
            }
        }
        for(int[] pos : list){
            fix(matrix, pos[0], pos[1]);
        }
        return;
    }
}