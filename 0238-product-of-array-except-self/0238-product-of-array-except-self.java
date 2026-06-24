class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for(int i = 1; i<ans.length; i++){
            prefix = prefix * nums[i-1];
            ans[i] = prefix;
        }
        for(int i = nums.length-2; i>=0; i--){
            suffix = suffix * nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
}