class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j]!=0){
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}