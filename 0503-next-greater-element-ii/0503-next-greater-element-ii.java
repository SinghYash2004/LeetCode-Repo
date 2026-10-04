class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int n = nums.length;
        int[] ans = new int[n];

        for(int i =2*n-1; i>=0; i--){
            int index = i%n;

            while(!stack.empty() && stack.peek() <= nums[index]){
                stack.pop();
            }

            if(stack.empty()){
                ans[index] = -1;
            }else{
                ans[index] = stack.peek();
            }

            stack.push(nums[index]);
        }
        return ans;
    }
}