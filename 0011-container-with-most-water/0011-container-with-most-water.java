class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int max = 0;
        int j = arr.length - 1;
        while (i < j) {
            int length = j - i;
            int height = Math.min(arr[i], arr[j]);
            int area = height * length;
            max = Math.max(max, area);
            if(arr[i]>arr[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}