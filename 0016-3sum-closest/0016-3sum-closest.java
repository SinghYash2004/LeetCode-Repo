class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closesum = nums[0]+nums[1]+nums[2];
        int i = 0;
        while(i<nums.length-2){
            if(i>0 && nums[i-1]==nums[i]){
                i++;
                continue;
            }
            int j= i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closesum)){
                    closesum = sum;
                }

                if(sum == target){
                    return sum;
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }

            }
            i++;
        }
        return closesum;
    }
}