class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swapTranspose(matrix, i, j);
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                swapRow(matrix, i, left, right);
                left++;
                right--;
            }
        }
    }

    // Swaps matrix[i][j] with matrix[j][i]
    public void swapTranspose(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    // Swaps two elements in the same row
    public void swapRow(int[][] matrix, int row, int left, int right) {
        int temp = matrix[row][left];
        matrix[row][left] = matrix[row][right];
        matrix[row][right] = temp;
    }
}