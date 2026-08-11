class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k){
            return -1;
        }
        
        int right = Integer.MIN_VALUE;
        int left = Integer.MAX_VALUE;
        for(int num:bloomDay){
            right = Math.max(num, right);
            left = Math.min(num, left);
        }

        if(bloomDay.length == m*k){
            return right;
        }

        int ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(check(bloomDay, m, k, mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public boolean check(int[] nums, int m, int k, int mid){
        int truecount = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<=mid){
                truecount++;
            }else{
                truecount = 0;
            }
            if(truecount==k){
                m--;
                truecount = 0;
            }
        }
        return m<=0;        
    }
}