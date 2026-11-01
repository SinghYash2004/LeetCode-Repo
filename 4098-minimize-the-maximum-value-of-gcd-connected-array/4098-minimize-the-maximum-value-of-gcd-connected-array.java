class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        int[] arr = {n, index, value};

        if(value == 1) return -1;

        long q = value;
        for(long p = 2; p*p <= value; p++){
            if(value%p==0){
                q= p;
                break;
            }
        }

        long left = (value-q)/2;
        if(index>left) return -1;

        long right = (long) n-1-index;
        if(right==0) return value;

        if(value%2==0) return value + 2L*right;
        return value + q + 2L *(right-1);
    }
}