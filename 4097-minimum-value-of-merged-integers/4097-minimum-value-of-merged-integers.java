class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i+=2){
            String s1 = String.valueOf(nums[i]);
            String s2 = String.valueOf(nums[i+1]);

            int num = Integer.parseInt(s1+s2);
            min = Math.min(min, num);
        }

        return min;
    }
}