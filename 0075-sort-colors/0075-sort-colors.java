class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        int three = 0;

        for(int i : nums){
            switch(i){
                case 0: one++; break;
                case 1: two++; break;
                case 2: three++; break;
            }
        }

        int i = 0;
        while(one>0){
            nums[i] = 0;
            one--;
            i++;
        }
        while(two>0){
            nums[i] = 1;
            two--;
            i++;
        }
        while(three>0){
            nums[i] = 2;
            three--;
            i++;
        }
    }
}