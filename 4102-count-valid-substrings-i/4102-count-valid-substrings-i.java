class Solution {
    public long countValidSubstrings(String s) {
        long ans = 0;
        int lastInvalid = -1;

        for(int i = 0;  i<s.length(); i++){
            if(i>=2 
               && s.charAt(i-2) == 'a' 
               && s.charAt(i-1) == 'b' 
               && s.charAt(i) == 'c'){
                lastInvalid = i-2;
               }
            ans+=i-lastInvalid;
        }
        return ans;
    }
}