class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];

        for (int x : nums) {
            freq[x]++;
        }

        int res = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (k == n) {
                res = Math.max(res, nums[i]);
            }

            else if (freq[nums[i]] == 1) {

                if (k == 1) {
                    res = Math.max(res, nums[i]);
                }

                else if (i == 0 || i == n - 1) {
                    res = Math.max(res, nums[i]);
                }
            }
        }

        return res;
    }
}