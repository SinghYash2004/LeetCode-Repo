class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;;
        for(int i = 0; i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }

        if(h==piles.length){
            return max;
        }

        int low = 1;
        int high = max;
        int mink =Integer.MAX_VALUE;

        while(low<=high){
            int mid = low +(high-low)/2;
            long hrs = 0;
            for(int i = 0; i<piles.length; i++){
                hrs += (piles[i] + mid -1)/mid;
            }

            if(hrs<=h){
                mink = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return mink;
    }
}