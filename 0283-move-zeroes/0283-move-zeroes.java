class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i+1;
        while(i<nums.length && j<nums.length){
            if(nums[i]!=0){
                i++;
            }
            if(nums[i]==0 && nums[j]!=0){
                swap(nums, i, j);
                i++;
                j=i+1;
            }else{
                j++;
            }
        }
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}