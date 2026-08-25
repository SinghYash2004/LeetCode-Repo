class Solution {
    public int[] findPeakGrid(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;

        int left = 0;
        int right = n-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            int maxrow = 0;

            //aab humko yaha maxrow nikalna hai matlab wo row index jisme uss col ka max element stored hai
            for(int i = 1; i<m; i++){
                if(nums[i][mid]>nums[maxrow][mid]){
                    maxrow = i;
                }
            }

            //aab humko uss maxrow ka leftvalue aur rightvalue nikalna padega
            int leftval = (mid>0) ? nums[maxrow][mid-1] : -1;
            int rightval = (mid<n-1) ? nums[maxrow][mid+1] : -1;

            if(nums[maxrow][mid] > leftval && nums[maxrow][mid]> rightval){
                return new int[]{maxrow, mid};
            }

            if(nums[maxrow][mid]<rightval){
                left = mid+1;
            }else{
                right =mid-1;
            }
        }
        return new int[]{-1, -1};
    }
}