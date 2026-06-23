import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();
        if (nums.length == 0) {
            return str;
        }
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            int j = i;
            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                j++;
            }
            if(nums[j]==start){
                str.add(String.valueOf(start));
            }else{
                str.add(start + "->" + nums[j]);
            }
            i=j+1;
        }
        return str;
    }
}