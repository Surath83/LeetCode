class Solution {
    public boolean check(String[][] mat, int a, int b, int n) {
        for (int i = 0; i < a; i++) {
            if (mat[i][b].equals("Q")) {
                return false;
            }
        }
        for (int i = a - 1, j = b - 1; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j].equals("Q")) {
                return false;
            }
        }
        for (int i = a - 1, j = b + 1; i >= 0 && j < n; i--, j++) {
            if (mat[i][j].equals("Q")) {
                return false;
            }
        }
        return true;
    }

    public List<String> added(String[][] mat, int n) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str.append(mat[i][j]);
            }
            temp.add(str.toString());
        }
        return temp;
    }

    public void solve(String[][] mat, int row, int n, List<List<String>> list) {
        if (row == n) {
            list.add(added(mat, n));
            return;
        }
        for (int j = 0; j < n; j++) {
            if (check(mat, row, j, n)) {
                mat[row][j] = "Q";
                solve(mat, row + 1, n, list);
                mat[row][j] = ".";
            }
        }
    }

    public int totalNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        String[][] mat = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = ".";
            }
        }
        solve(mat, 0, n, list);
        return list.size();
    }
}