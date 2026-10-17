class Solution {
    public int trap(int[] height) {
        int total = 0;
        int n = height.length;
        int prefixMax = 0;

        int suffixMax[] = new int[n];
        suffixMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
        }

        for(int i =0; i<n; i++){
            prefixMax = Math.max(prefixMax, height[i]);
            
            if(height[i]<prefixMax && height[i]<suffixMax[i]){
                total+= (Math.min(prefixMax, suffixMax[i]) - height[i]);
            }
        }
        return total;
    }
}