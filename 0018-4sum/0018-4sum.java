class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> outlist = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i <= nums.length - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j <= nums.length - 3; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int m = j + 1;
                int n = nums.length - 1;
                long newtarget = (long)target - (nums[i] + nums[j]);

                while (m < n) {
                    if (nums[m] + nums[n] == newtarget) {
                        outlist.add(List.of(nums[i], nums[j], nums[m], nums[n]));
                        m++;
                        n--;

                        while(m<n && nums[m] == nums[m-1]){
                            m++;
                        }

                        while(m<n && nums[n] == nums[n+1]){
                            n--;
                        }
                    }else if(nums[m] + nums[n] > newtarget){
                        n--;
                    }else{
                        m++;
                    }
                }
            }
        }
        return outlist;
    }
}