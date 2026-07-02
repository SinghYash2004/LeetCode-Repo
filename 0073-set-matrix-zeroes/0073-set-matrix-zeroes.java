class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zr = new boolean[rows];
        boolean[] zc = new boolean[cols];
        boolean isempty = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zr[i] = true;
                    zc[j] = true;
                    isempty = false;
                }
            }
        }

        if (!isempty) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (zr[i] || zc[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}