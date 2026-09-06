class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int olow = 0;
        int ohigh = n - 1;

        while (olow <= ohigh) {
            int omid = olow + (ohigh - olow) / 2;

            if (matrix[omid][0] <= target && target <= matrix[omid][m - 1]) {
                int low = 0;
                int high = m - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (matrix[omid][mid] == target) {
                        return true;
                    } else if (matrix[omid][mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                return false;
            }
            if (matrix[omid][0] > target) {
                ohigh = omid - 1;
            } else {
                olow = omid + 1;
            }
        }
        return false;
    }
}