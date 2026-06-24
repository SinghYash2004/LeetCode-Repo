class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum+=n;
        }
        int leftsum = 0;
        for(int i  = 0; i<nums.length;i++){
            if(leftsum*2 == (sum - nums[i])){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}