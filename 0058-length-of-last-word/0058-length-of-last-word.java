class Solution {
    public int lengthOfLastWord(String str) {
        String[] words = str.split(" ");
        return words[words.length -1].length();
    }
}