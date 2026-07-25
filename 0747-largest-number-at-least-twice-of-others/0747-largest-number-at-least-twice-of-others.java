class Solution {
    public int dominantIndex(int[] nums) {
       int max =0;
       int secmax = 0;
       int index = -1;
       for(int i = 0; i<nums.length; i++){
          if(nums[i]>max){
            secmax = max;
            max = nums[i];
            index = i;
          }else if(nums[i]>secmax){
            secmax=nums[i];
          }
       }

       if(max>=2*secmax){
        return index;
       }
       return -1;
    }
}

/* ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }

        Arrays.sort(nums);
        if(nums[nums.length-1]>=2*nums[nums.length-2]){
            return list.indexOf(nums[nums.length-1]);
        }

        return -1; */