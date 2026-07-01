class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = bslow(nums, target);
        ans[1] = bshigh(nums, target);
        return ans;
    }

    public int bslow(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]==target){
                ans = mid;
                j = mid-1;
            }else if(arr[mid]>target){
                j = mid-1;
            }else{
                i = mid +1;
            }
        }
        return ans;
    }

    public int bshigh(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]==target){
                ans = mid;
                i = mid+1;
            }else if(arr[mid]>target){
                j = mid-1;
            }else{
                i = mid +1;
            }
        }
        return ans;
    }
}