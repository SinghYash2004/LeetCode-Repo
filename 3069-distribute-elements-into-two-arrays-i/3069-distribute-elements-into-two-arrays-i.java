class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int i = 0, j= 0;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int num:nums){
            if(i==0){
                arr1[i++]=num;
            }else if(j == 0){
                arr2[j++]=num;
            }else if(arr1[i-1]>arr2[j-1]){
                arr1[i++]=num;
            }else{
                arr2[j++]=num;
            }
        }

        int[] ans = new int[n];
        int index = 0;
        int k = 0, l = 0;
        while(arr1[k]!=0){
            ans[index++] = arr1[k++];
        }

        while(arr2[l]!=0){
            ans[index++]=arr2[l++];
        }

        return ans;
    }
}