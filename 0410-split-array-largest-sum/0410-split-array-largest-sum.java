class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for(int num:nums){
            left = Math.max(left, num);
            right += num;
        }

        while(right >= left){
            int mid = left +(right-left)/2;
            if(subarraycount(nums, mid)<=k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public int subarraycount(int[] nums, int minsum){
        int count = 1, sum = 0;
        for(int num:nums){
            if(sum+num<=minsum){
                sum+=num;
            }else{
                count++;
                sum = num;
            }
        }
        return count;
    }
}