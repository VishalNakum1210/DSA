import java.util.ArrayList;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            int minValue = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < c; j++) {
                if(minValue > matrix[i][j]){
                    minValue = matrix[i][j];
                    index = j;
                }
            }
            int maxValue = Integer.MIN_VALUE;
            for(int j = 0; j < r; j++){
                if(maxValue < matrix[j][index]){
                    maxValue = matrix[j][index];
                }
            }
            if(minValue == maxValue){
                System.out.println(minValue+" "+maxValue);
                res.add(minValue);
                return res;
            }
        }

        return new ArrayList<Integer>();
    }
}