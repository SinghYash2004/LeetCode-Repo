class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
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
        int min_k =Integer.MAX_VALUE;

        while(low<=high){
            int mid = low +(high-low)/2;
            long hrs = 0;
            for(int i = 0; i<piles.length; i++){
                hrs += (piles[i] + mid -1)/mid;
            }

            if(hrs<=h){
                min_k = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return min_k;
    }
}