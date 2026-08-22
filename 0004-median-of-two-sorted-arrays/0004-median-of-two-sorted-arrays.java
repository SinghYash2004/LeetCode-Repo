class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int size = m+n;
        int target1 = (size-1)/2;
        int target2 = size/2;

        int prev = -1, curr = -1;
        int i =0, j = 0;

        for(int count = 0; count<=target2; count++){
            prev = curr;

            if(i<m && j<n){
                if(nums1[i]<=nums2[j]){
                    curr = nums1[i++];
                }else{
                    curr = nums2[j++];
                }
            }else if(i<m){
                curr = nums1[i++];
            }else{
                curr = nums2[j++];
            }
        }
        if(size%2==0){
            return (prev + curr )/2.0;
        }

        return curr;
    }
}
