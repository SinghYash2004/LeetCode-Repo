class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num:nums){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        while(min>0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}