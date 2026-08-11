class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;
        if (checkMat(mat, target))
            return true;
        for (int rot = 0; rot <= 2; rot++) {
            rotate(mat, target);
            if (checkMat(mat, target))
                return true;
        }
        return false;
    }

    private void rotate(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && j > i) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            int start = 0, end = n - 1;

            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    private boolean checkMat(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}