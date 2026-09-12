import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (seen.contains(matrix[i][j]))
                    return false;
                seen.add(matrix[i][j]);
            }
            seen.clear();
            for (int j = 0; j < n; j++) {
                if (seen.contains(matrix[j][i]))
                    return false;
                seen.add(matrix[j][i]);
            }
            seen.clear();
        }
        return true;
    }
}