class Solution {
    public int search(int[] arr, int target) {
        int i = 0;
        int j = arr.length -1;
        while(i<=j){
            int mid = i+(j-i)/2; 
            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>=arr[i]){
                if(target>=arr[i] && arr[mid]>target){
                    j = mid-1;
                }else{
                    i = mid+1;
                }
            }

            else{
                if(target<=arr[j] && target>arr[mid]){
                    i = mid+1;
                }else{
                    j = mid-1;
                }
            }
        }
        return -1;
    }
}