class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int maxrowindex = 0;
        int maxones = 0;

        for(int row = 0; row<rows; row++){
            int count = 0;
            for(int i = 0; i<cols; i++){
                if(mat[row][i] == 1) count++;
            }
            if(maxones<count){
                maxones = count;
                maxrowindex = row;
            }
        }
        return new int[]{maxrowindex, maxones};
    }
}