class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        int[] nse = nextSmallerElement(nums);
        int[] nge = nextGreaterElement(nums);
        int[] pse = prevSmallerElement(nums);
        int[] pge = prevGreaterElement(nums);

        long ans = 0;

        for(int i = 0; i<n; i++){
            long min = (long) nums[i] * (i-pse[i]) * (nse[i] - i);
            long max = (long) nums[i] * (i-pge[i]) * (nge[i] - i);
            ans += (max - min);
        }

        return ans;
    }

    public int[] nextSmallerElement(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i =n-1; i>=0; i--){
            while(!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            if(stack.empty()){
                nse[i] = n;
            }else{
                nse[i] = stack.peek();
            }

            stack.push(i);
        }
        return nse;
    }

    public int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i =n-1; i>=0; i--){
            while(!stack.empty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }

            if(stack.empty()){
                nge[i] = n;
            }else{
                nge[i] = stack.peek();
            }

            stack.push(i);
        }
        return nge;
    }

    public int[] prevSmallerElement(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n; i++){
            while(!stack.empty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }

            if(stack.empty()){
                pse[i] = -1;
            }else{
                pse[i] = stack.peek();
            }

            stack.push(i);
        }

        return pse;
    }

    public int[] prevGreaterElement(int[] arr){
        int n = arr.length;
        int[] pge = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n; i++){
            while(!stack.empty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }

            if(stack.empty()){
                pge[i] = -1;
            }else{
                pge[i] = stack.peek();
            }

            stack.push(i);
        }
        return pge;
    }
}