class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(num, max);
        }

        
        List<Boolean> list = new ArrayList<>();
        for(int num:nums){
            if(num + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}