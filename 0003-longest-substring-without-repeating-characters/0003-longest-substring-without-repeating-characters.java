class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int left = 0, right = 0, len = 0, ans = 0;
        while(right<s.length()){
            hash.put(s.charAt(right), hash.getOrDefault(s.charAt(right), 0)+1);

            if(hash.get(s.charAt(right)) == 1){
                len = right-left+1;
                ans = Math.max(ans, len);
            }else{
                while(hash.get(s.charAt(right)) != 1){
                    hash.put(s.charAt(left), hash.get(s.charAt(left))-1);
                    left++;
                }
            }
            right++;
        }
        return ans;
    }
}