class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int num1 =0;
        for(int num:nums){
            if(!set.contains(num)){
                sum += num;
                set.add(num);
            }else{
                num1 = num;
            }
        }

        int n = nums.length;
        int total = (n*(n+1))/2;
        int num2 = total - sum;
        return new int[]{num1, num2}; 
    }
}