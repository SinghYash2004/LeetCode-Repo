class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxlen = 0, len = 0;

        while(right<nums.length){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            len++;
            while(map.get(nums[right]) > k){
                map.put(nums[left],  map.get(nums[left]) - 1);
                left++;
                len--;
            }
            maxlen = Math.max(maxlen, len);
            right++;
        }
        return maxlen;
    }
}