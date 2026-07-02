class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int low =0, high =0;
        for(int i:nums){
            low=Math.max(low, i);
            high+=i;
        } 

        while(low<=high){
            int mid = low + (high-low)/2;
            int current = 0, need = 1;
            for(int i:nums){
                if(current+i >mid){
                    need++;
                    current = 0;
                }
                current+=i;
            }

            if(need>days) low= mid+1;
            else high = mid-1;
        }
        return low;
    }
}