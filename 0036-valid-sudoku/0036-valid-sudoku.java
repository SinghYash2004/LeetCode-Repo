class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean row = rowcheck(board);
        boolean column = columncheck(board);
        boolean boxes = boxcheck(board);
        return row && column && boxes;
    }

    public boolean rowcheck(char[][] board) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }

    public boolean columncheck(char[][] board) {
        int n = 9;
        for (int j = 0; j < n; j++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }

    public boolean boxcheck(char[][] board) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            if (set.contains(board[i][j])) {
                                return false;
                            }
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}