class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int num:nums){
            right = Math.max(num, right);
        }
        
        int ans = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            int sum = divisionsum(nums, mid);
            if(sum<=threshold){
                ans = Math.min(ans, mid);
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public int divisionsum(int[] nums, int divisor){
        int sum = 0;
        for(int num:nums){
            if(num%divisor==0){
                sum+=num/divisor;
            }else{
                sum+=(num/divisor)+1;
            }
        }
        return sum;
    }
}