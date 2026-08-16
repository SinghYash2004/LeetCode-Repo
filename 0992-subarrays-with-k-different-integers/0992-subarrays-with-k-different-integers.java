class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countmax(nums, k)-countmax(nums, k-1);
    }

    public int countmax(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, len = 0, ans = 0;
        
        while(right<nums.length){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            len++;

            while(map.size()>k){
                map.put(nums[left], map.getOrDefault(nums[left], 0)-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
                len--;
            }

            ans += right-left+1;
            right++;
        }
        return ans;
    }
}