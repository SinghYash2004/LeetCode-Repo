class Solution {
    public boolean isMonotonic(int[] nums) {
        
         if (nums.length <= 2)
            return true;

        int i = 0;
        int j = 1;

        while (j < nums.length && nums[i] == nums[j]) {
            i++;
            j++;
        }

        if (j == nums.length)
            return true;
            
        if(nums[i]<nums[j]){
            while(i<nums.length&&j<nums.length){
                if(nums[i]<=nums[j]){
                    i++;
                    j++;
                }else{
                    return false;
                }
            }return true;
        }

        if(nums[i]>nums[j]){
            while(i<nums.length&&j<nums.length){
                if(nums[i]>=nums[j]){
                    i++;
                    j++;
                }else{
                    return false;
                }
            }return true;
        }
        return true;
    }
}
