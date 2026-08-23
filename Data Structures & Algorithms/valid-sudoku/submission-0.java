class Solution {
    public boolean isValidSudoku(char[][] board) {

        int r = board.length;
        int c = board[0].length;

        // Row-wise check
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                for (int k = j + 1; k < c; k++) {
                    if (board[i][j] == board[i][k]) {
                        return false;
                    }
                }
            }
        }


        // Column-wise check
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                for (int k = i + 1; k < r; k++) {
                    if (board[i][j] == board[k][j]) {
                        return false;
                    }
                }
            }
        }


        // 3 x 3 Box-wise check
        for (int br = 0; br < 9; br += 3) {
            for (int bc = 0; bc < 9; bc += 3) {
                for (int r1 = br; r1 < br + 3; r1++) {
                    for (int c1 = bc; c1 < bc + 3; c1++) {
                        if (board[r1][c1] == '.') {
                            continue;
                        }

                        for (int r2 = r1; r2 < br + 3; r2++) {
                            for (int c2 = bc; c2 < bc + 3; c2++) {
                                if (r1 == r2 && c1 == c2) {
                                    continue;
                                }

                                if (board[r1][c1] == board[r2][c2]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}