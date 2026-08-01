class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        int i =0; 
        int j=sb.length()-1;
        int n = sb.length()/2;
        while(i<=n&&j>=n){
            if(sb.charAt(i)!=(sb.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}