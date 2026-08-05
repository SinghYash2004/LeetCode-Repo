class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0, maxlen = 0,  maxfreq = 0;
        int[] hash =  new int[26];

        while(j<s.length()){
            maxfreq = Math.max(maxfreq, ++hash[s.charAt(j)-'A']);

            while((j-i+1) - maxfreq > k){
                hash[s.charAt(i)-'A']--;
                i++;
            }

            maxlen = Math.max(maxlen,  j-i+1);
            j++;
        }
        return maxlen;
    }
}