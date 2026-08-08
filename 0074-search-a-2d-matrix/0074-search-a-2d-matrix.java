class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int n = matrix[0].length - 1;
        while(left<=right) {
            int outermid = left + (right - left) / 2;
            if (target >= matrix[outermid][0] && target <= matrix[outermid][n]) {
                int low = 0;
                int high = n;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (matrix[outermid][mid] == target) {
                        return true;
                    } else if (matrix[outermid][mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                return false;
            }else if(target<matrix[outermid][0]){
                right = outermid-1;
            }else{
                left = outermid +1;
            }
        }
        return false;
    }
}