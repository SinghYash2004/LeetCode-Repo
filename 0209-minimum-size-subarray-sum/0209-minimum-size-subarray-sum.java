class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, sum = 0, min=Integer.MAX_VALUE;
        for(int j = 0;j<nums.length; j++){
            sum+=nums[j];

            while(sum>=target){
                min=Math.min(j-i+1, min);
                sum-=nums[i++];
            }
        }
        return min==Integer.MAX_VALUE ? 0:min;
    }
}