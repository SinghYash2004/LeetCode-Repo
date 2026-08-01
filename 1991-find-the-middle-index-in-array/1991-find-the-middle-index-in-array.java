class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }

        int check = 0;
        for(int i = 0; i<nums.length; i++){
            if(check+check == sum-nums[i]){
                return i;
            }
            check += nums[i];
        }
        return -1;
    }
}