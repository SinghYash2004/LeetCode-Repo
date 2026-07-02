class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i :nums){
            set.add(i);
        }

        int max = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;

                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}