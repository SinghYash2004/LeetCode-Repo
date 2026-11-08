class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();

        long ans = 0;
        int left = 0;

        String str = s;

        int firstA = -1;
        int firstAB = -1;

        for(int right = 0; right<n; right++){
            char ch = str.charAt(right);

            if(ch == 'a') firstA = right;
            else if(ch ==  'b' && firstA != -1) {
                firstAB = firstA;
            }
            else if(ch  == 'c' && firstAB != -1){
                left = Math.max(left, firstAB +1);
            }

            ans+=right -left+1;
        }

        return ans;
    }
}