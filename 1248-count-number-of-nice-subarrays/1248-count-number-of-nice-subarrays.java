class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 != 0){
                arr[i] = 1;
            }else{
                arr[i] =0;
            }
        }
        return countmax(arr, k)-countmax(arr, k-1);
    }
    public int countmax(int[] nums, int goal){
        if(goal<0) return 0;
        int left = 0, right = 0, count = 0, sum = 0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal){
                sum -= nums[left++];
            }
            count += (right-left+1);
            right++;
        } 
        return count;
    }
}