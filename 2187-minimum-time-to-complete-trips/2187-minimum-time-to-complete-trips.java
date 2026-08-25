class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min = Integer.MAX_VALUE;

        for(int num:time){
            min = Math.min(num, min);
        }

        long left = min;
        long right = (long) min * totalTrips;

        while(right>=left){
            long mid = left + (right-left)/2;
            long tours = counttours(time, mid);
            if(tours<totalTrips){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }

    public long counttours(int[] nums, long tour){
        long count = 0;
        for(int num:nums){
            count+=tour/num;
        }
        return count;
    }
}