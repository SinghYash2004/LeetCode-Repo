class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1freq[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = left + s1.length();

        int[] s2freq = new int[26];
        for (int i = 0; i < right; i++) {
            s2freq[s2.charAt(i) - 'a']++;
        }

        while (right <= s2.length()) {
            boolean isPermut = Arrays.equals(s1freq, s2freq);
            if (isPermut) {
                return true;
            }

            if (right == s2.length()) {
                break;
            }

            s2freq[s2.charAt(left++) - 'a']--;
            s2freq[s2.charAt(right++) - 'a']++;
        }
        return false;
    }
}