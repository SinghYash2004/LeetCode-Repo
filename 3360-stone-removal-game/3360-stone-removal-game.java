class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        boolean ans = false;

        while (n >= k) {
            n -= k;
            ans = !ans;
            k--;
        }

        return ans;
    }
}