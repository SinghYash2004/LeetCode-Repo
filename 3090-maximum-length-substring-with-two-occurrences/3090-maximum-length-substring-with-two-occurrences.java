class Solution {
    public int maximumLengthSubstring(String s) {
        int[] hash = new int[26];
        int maxlen = 0;
        int len = 0;
        int left = 0;
        int right = 0;
        while(right<s.length()){
            hash[s.charAt(right)-'a']++;
            len++;
            while(hash[s.charAt(right)-'a'] > 2){
                hash[s.charAt(left)-'a']--;
                left++;
                len--;
            }
            maxlen = Math.max(maxlen, len);
            right++;
        }
        return maxlen;
    }
}