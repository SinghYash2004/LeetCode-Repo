class Solution {
    public int findLucky(int[] nums) {
        int[] hash = new int[501];
        for(int num:nums){
            hash[num]++;
        }
        
        for(int i = 500; i>0; i--){
            if(hash[i]==i) return i;
        }
        return -1;
    }
}