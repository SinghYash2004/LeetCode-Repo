class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        for(int i = 0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            ransom[ch - 'a']++;
        }
        int[] mag = new int[26];
        for(int i = 0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            mag[ch-'a']++;
        }
        int i=0;
       while(i<ransomNote.length()){
            char ch = ransomNote.charAt(i);
            if(ransom[ch - 'a'] <= mag[ch-'a']){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}