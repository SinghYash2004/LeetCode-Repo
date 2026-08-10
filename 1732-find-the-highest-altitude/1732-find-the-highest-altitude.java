class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int alti = 0;
        for(int i = 0; i<gain.length; i++){
            alti = alti + gain[i];
            max = Math.max(max, alti);
        }
return max;
    }
}