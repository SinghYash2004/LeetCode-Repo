class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> outlist = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n-3){
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int j = i+1;
            while(j<n-2){
                if(j>i+1 && nums[j]==nums[j-1]){
                    j++;
                    continue;
                }
                int m = j+1;
                int p = n-1;
                long newtarget = (long)target - (nums[i] + nums[j]);
                while(m<p){
                    long sum = (long)nums[m] + nums[p];
                    if(sum == newtarget){
                        outlist.add(List.of(nums[i], nums[j], nums[m], nums[p]));
                        m++;
                        p--;

                        while(m<p && nums[m]==nums[m-1]){
                            m++;
                        }
                        while(m<p && nums[p]==nums[p+1]){
                            p--;
                        }
                    }else if(sum > newtarget){
                        p--;
                    }else{
                        m++;
                    }
                }
                j++;
            }
            i++;
        }
        return outlist;
    }
}