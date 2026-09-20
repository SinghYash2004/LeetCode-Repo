class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;

        String s = "";

        int count = 1;
        int i = 0;
        while(i<chars.length){
            while(i + 1 < chars.length && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            if(count==1) s += chars[i];
            else{
                s = s + chars[i];
                s += count;
                count = 1;
            }
            i++;
        }

        for(int j = 0; j<s.length(); j++){
            char ch = s.charAt(j);
            chars[j] = ch;
        }

        return s.length();
    }
}