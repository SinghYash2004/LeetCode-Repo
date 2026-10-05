class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;
        int power = 1;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                depth++;
                power *= 2;
            } else {
                depth--;
                power /= 2;

                if(s.charAt(i - 1) == '(') {
                    score += power;
                }
            }
        }

        return score;
    }
}