class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == '1') {
                    heights[col]++;
                } else {
                    heights[col] = 0;
                }
            }

            maxArea = Math.max(maxArea, histogram(heights));
        }
        return maxArea;
    }

    public int histogram(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int left = 0;
        int n = arr.length;

        while (left < n) {
            while (!stack.isEmpty() && (arr[stack.peek()]) > (arr[left])) {
                int poppedIndex = stack.pop();
                int leftIndex = stack.isEmpty() ? 0 : stack.peek() + 1;
                int rightIndex = left;
                int width = rightIndex - leftIndex;
                maxArea = Math.max(maxArea, width * (arr[poppedIndex]));
            }
            stack.push(left);
            left++;
        }

        while (!stack.isEmpty()) {
            int poppedIndex = stack.pop();
            int leftIndex = stack.isEmpty() ? 0 : stack.peek() + 1;
            int rightIndex = n;
            int width = rightIndex - leftIndex;
            maxArea = Math.max(maxArea, width * (arr[poppedIndex]));
        }
        return maxArea;
    }
}
