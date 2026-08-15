class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0, n = nums.length;
        boolean iszero = false;
        
        for(int num:nums){
            if(num>0) iszero = true;
            total ^= num;
        }

        if(total!=0) return n;

        if(iszero) return n-1;

        return 0;
    }
}