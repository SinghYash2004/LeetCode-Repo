class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1_000_000_007;

        int[] nse = nextSmallerElement(arr);
        int[] pse = prevSmallerElement(arr);

        long ans = 0;
        for(int i = 0; i<n; i++){
            long left = i-pse[i];
            long right = nse[i] - i;
            ans = (ans + left * right * arr[i]) % mod;
        }

        return (int) ans;
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

    
}