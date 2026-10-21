class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(isSorted(s)) return 0;
        if(n == 2) return -1;

        int least = Integer.MAX_VALUE, max = -1;
        
        for(char ch:s.toCharArray()){
            least = Math.min(least, ch-'a');
            max = Math.max(max, ch-'a');
        }

        if(s.charAt(0)-'a' == least || s.charAt(n-1)-'a' == max) return 1;

        for(int i = 1; i<n-1; i++){
            int ascii = s.charAt(i)-'a';
            if(ascii == least || ascii == max){
                return 2;
            }
        }

        return 3;
    }

    public boolean isSorted(String s){
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i)-'a' < s.charAt(i-1)-'a') return false;
        }
        return true;
    }
}