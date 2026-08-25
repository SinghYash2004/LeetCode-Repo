class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int index=0;
        for(int i =1; i<=nums.length;i++){
            if(!set.contains(i*k)){
                return i*k;
            }
            index=i;
        }
        return (index+1)*k;
    }
}