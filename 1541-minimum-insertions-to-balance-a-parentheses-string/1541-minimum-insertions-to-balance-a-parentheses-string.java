class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0, curr = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                curr++;
            } else {
                if (i < n - 1 && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }

                if (curr == 0) {
                    count++;
                } else {
                    curr--;
                }
            }
        }

        count += 2 * curr;
        return count;
    }
}