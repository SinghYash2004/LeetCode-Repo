class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int temp = num;
                int count = 1;
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}