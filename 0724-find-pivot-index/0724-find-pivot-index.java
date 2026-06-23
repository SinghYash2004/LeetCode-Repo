class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int leftsum = leftSum(nums, i);
            int rightsum = rightSum(nums, i);
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
    public int leftSum(int[] arr, int index){
        int leftsum = 0;
        for(int i=index-1; i>=0; i--){
            leftsum+=arr[i];
        }
        return leftsum;
    }
    public int rightSum(int[] arr, int index){
        int rightsum = 0;
        for(int i=index+1; i<arr.length; i++){
            rightsum+=arr[i];
        }
        return rightsum;
    }
}