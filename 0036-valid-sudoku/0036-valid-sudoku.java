import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> checked = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i % 3 == 0 && j % 3 == 0) {
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            if (board[k][l] != '.') {
                                if (checked.contains(board[k][l]))
                                    return false;
                                checked.add(board[k][l]);
                            }
                        }
                    }
                    checked.clear();
                }
                if (board[i][j] == '.')
                    continue;
                for (int row = 0; row < 9; row++) {
                    if (row != i && board[row][j] == board[i][j])
                        return false;
                }
                for (int col = 0; col < 9; col++) {
                    if (col != j && board[i][col] == board[i][j])
                        return false;
                }
            }
        }
        return true;
    }
}
