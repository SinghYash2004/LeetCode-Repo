class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;

        StringBuilder sb = new StringBuilder(s);
        while(i<j){
            while((i<j) && !isVowel(sb.charAt(i))){
                i++;
            }
            while((i<j) && !isVowel(sb.charAt(j))){
                j--;
            }

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }

    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }else{
            return false;
        }
    }
}