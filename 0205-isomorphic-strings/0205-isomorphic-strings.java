class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] st = new int[128];
        int[] ts = new int[128];
        Arrays.fill(st, -1);
        Arrays.fill(ts, -1);
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (st[s1] == -1) {
                st[s1] = t1;
            }
            if (ts[t1] == -1) {
                ts[t1] = s1;
            }
            if (st[s1] != t1 || ts[t1] != s1) {
                return false;
            }

        }
        return true;
    }
}