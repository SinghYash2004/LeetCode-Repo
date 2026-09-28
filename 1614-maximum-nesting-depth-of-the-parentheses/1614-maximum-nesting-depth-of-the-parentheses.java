class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();

        int max = 0;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
                if(count>0) count--;
            } else if (ch == ')') {
                stack.pop();
                count++;
                max = Math.max(count, max);
            } else {
                continue;
            }
        }
        return max;
    }
}