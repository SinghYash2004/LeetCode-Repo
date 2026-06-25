class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            int digit = 0;
            while(i>0){
                digit++;
                i/=10;
            }
            if((digit%2)==0){
                count++;
            }
        }
        return count;
    }
}