class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int firstnum = 0;
        for(int num:nums){
            if(set.contains(num)){
                firstnum = num;
                break; 
            }else{
                set.add(num);
            }
        }
        int[] ans = new int[2];
        int n = nums.length;
        ans[0] = firstnum;
        int sum = 0;
        for(int num :nums){
            sum += num;
        }
        int total = ((n)*(n+1))/2;
        ans[1] = total - (sum-firstnum);
        return ans;
    }
}