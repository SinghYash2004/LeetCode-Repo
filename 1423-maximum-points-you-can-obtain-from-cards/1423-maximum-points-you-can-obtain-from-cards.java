class Solution {
    public int maxScore(int[] nums, int k) {
        int total = 0;
        for(int num:nums){
            total += num;
        }

        if(k==nums.length) return total;

        int remain = nums.length -k;
        int count = 0, left = 0, right = 0, sum = 0, ans = 0;

        while(right<nums.length){
            sum += nums[right];
            count++;
            if(count==remain){
                ans = Math.max(ans, total-sum);
                sum-=nums[left++];
                count--;
            }
            right++;
        }
        return ans;
    }
}