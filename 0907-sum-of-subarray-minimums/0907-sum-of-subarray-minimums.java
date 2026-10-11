class Solution {
    public int sumSubarrayMins(int[] arr) {
        long ans = 0;
        int mod = 1_000_000_007;

        int[] nse = nextSmallerIndex(arr);
        int[] pse = prevSmallerIndex(arr);

        for (int i = 0; i < arr.length; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            ans = (ans + left * right * arr[i]) % mod;
        }

        return (int) ans;
    }

    public int[] nextSmallerIndex(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nse = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                nse[i] = arr.length;
            } else {
                nse[i] = stack.peek();
            }
            stack.push(i);
        }

        return nse;
    }

    public int[] prevSmallerIndex(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] pse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.empty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
                pse[i] = stack.peek();
            } else {
                pse[i] = -1;
            }
            stack.push(i);
        }
        return pse;
    }
}