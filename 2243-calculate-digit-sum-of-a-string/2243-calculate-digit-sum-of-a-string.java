class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            int i = 0;
            int x = (s.length() + k - 1) / k;

            for (int j = 0; j < x; j++) {
                int num = 0;
                int len = k;

                while (len > 0 && i < s.length()) {
                    num += s.charAt(i++) - '0';
                    len--;
                }

                sb.append(num);
            }

            s = sb.toString();
        }

        return s;
    }
}