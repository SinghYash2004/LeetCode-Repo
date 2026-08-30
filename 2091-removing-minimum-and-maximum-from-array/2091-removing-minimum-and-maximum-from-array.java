class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        int bothLeft = Math.max(minIndex, maxIndex) + 1;
        int bothRight = n - Math.min(minIndex, maxIndex);
        int oneLeftoneRight = Math.min(minIndex, maxIndex)+1 + n- Math.max(minIndex, maxIndex);

        return Math.min(bothLeft, Math.min(bothRight, oneLeftoneRight));
    }
}