class Solution {
    public boolean checkString(String s) {
        int i = 0;
        int n = s.length();
        while (i<n && s.charAt(i) == 'a') {
            i++;
        }
        while (i<n && s.charAt(i) == 'b') {
            i++;
        }

        return i == n;
    }
}