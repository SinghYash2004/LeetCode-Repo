class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n = nums.length;
        int[] arr = nums.clone();

        int c = 0, prefixMax = 0;
        for(int i = 0;i<n;i++){
            prefixMax = Math.max(prefixMax, nums[i]);
            if(locked[i] == 1 && !(nums[i] == i+1 && prefixMax == i+1)){
                c++;
            }
        }

        if(c>k) return -1;

        int[] bit = new int[n+2];
        long inv = 0;
        for(int i = n-1; i>=0; i--){
            for(int x = nums[i]-1; x>0; x-=x & -x) inv += bit[x];
            for(int x = nums[i]; x<=n; x+= x & -x) bit[x]++;
        }

        return (int) (inv+c);
    }
}