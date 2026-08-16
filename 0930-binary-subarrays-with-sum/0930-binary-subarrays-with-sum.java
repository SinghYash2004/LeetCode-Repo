class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countmax(nums, goal)-countmax(nums, goal-1);
    }

    public int countmax(int[] nums, int goal){
        if(goal<0) return 0;
        int left = 0, right = 0, count = 0, sum = 0;
        while(right<nums.length){
            sum += nums[right];
            while(sum>goal){
                sum -= nums[left++];
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}