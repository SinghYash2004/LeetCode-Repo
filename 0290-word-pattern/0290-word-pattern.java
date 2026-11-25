class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> ps = new HashMap<>();
        HashMap<String, Character> sp = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        for (int i = 0; i < str.length; i++) {
            char ch = pattern.charAt(i);
            String stri = str[i];

            if (!ps.containsKey(ch)) {
                ps.put(ch, stri);
            }

            if (!sp.containsKey(stri)) {
                sp.put(stri, ch);
            }

            if (!ps.get(ch).equals(stri) || sp.get(stri) != ch) {
                return false;
            }
        }
        return true;
    }
}