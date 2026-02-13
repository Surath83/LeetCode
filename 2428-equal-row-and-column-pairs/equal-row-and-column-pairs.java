class Solution {
    public int equalPairs(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length;
        Map<String,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0; i<m; i++){
            StringBuilder key = new StringBuilder();
            for(int j=0; j<m; j++){
                key.append(grid[i][j]).append(",");
            }
            map.put(key.toString(),map.getOrDefault(key.toString(),0)+1);
        }
        for(int i=0; i<m; i++){
            StringBuilder key = new StringBuilder();
            for(int j=0; j<m; j++){
                key.append(grid[j][i]).append(",");
            }
            res += map.getOrDefault(key.toString(),0);
        }
        return res;
    }
}