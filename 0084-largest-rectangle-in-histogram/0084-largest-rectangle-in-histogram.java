class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        int left = 0;
        int n = heights.length;

        while (left < n) {
            while (!stack.empty() && heights[stack.peek()] > heights[left]) {
                int poppedIndex = stack.pop();
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int rightBoundary = left;
                int width = rightBoundary - leftBoundary - 1;
                maxArea = Math.max(maxArea, width * heights[poppedIndex]);
            }
            stack.push(left);
            left++;
        }
        while (!stack.empty()) {
            int poppedIndex = stack.pop();
            int leftBoundary = stack.empty() ? -1 : stack.peek();
            int width = n - leftBoundary - 1;

            maxArea = Math.max(maxArea, width * heights[poppedIndex]);
        }
        return maxArea;
    }
}