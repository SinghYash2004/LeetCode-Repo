class Solution {
    public boolean divideArray(int[] nums) {
        int[] hash = new int[500];
        for(int num:nums){
            hash[num-1]++;
        }
        for (int num:hash) {
            if(num==0){
                continue;
            }else if(num%2 != 0){
                return false;
            }
        }

        return true;
    }
}