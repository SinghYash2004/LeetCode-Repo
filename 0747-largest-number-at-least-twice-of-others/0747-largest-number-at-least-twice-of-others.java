class Solution {
    public int dominantIndex(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }

        Arrays.sort(nums);
        if(nums[nums.length-1]>=2*nums[nums.length-2]){
            return list.indexOf(nums[nums.length-1]);
        }

        return -1;
    }
}