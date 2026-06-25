class Solution {
    public int maxProfit(int[] arr) {
        int i = 0;
        int j = 1;
        int profit = 0;
        while(i<arr.length && j<arr.length){
            if(arr[i]<arr[j]){
                profit= Math.max(profit, arr[j]-arr[i]);
                j++;
            }else if(arr[i]>=arr[j]){
                i=j;
                j++;
            }
        }
        return profit;
    }
}