class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (i < n - 1 && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }

                if (stack.empty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        count += stack.size() * 2;
        return count;
    }
}