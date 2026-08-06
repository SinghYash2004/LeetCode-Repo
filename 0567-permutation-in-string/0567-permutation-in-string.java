class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] hash1 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            hash1[s1.charAt(i)-'a']++;
        }

        int left = 0;
        int right = 0;
        int[] hash2 = new int[26];
        int len = 0;
        while(right<s2.length()){
            hash2[s2.charAt(right)-'a']++;
            
            if(Arrays.equals(hash1, hash2)){
                return true;
            }
            len++;
            
            if(len>=s1.length() && left<s2.length()){
                hash2[s2.charAt(left)-'a']--;
                left++;
                len--;
            }
            right++;
        }
        return false;
    }
}