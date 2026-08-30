class Solution {
    public int minDeletions(String s) {
        int[] hash  = new int[26];
        for(char ch : s.toCharArray()){
            hash[ch-'a']++;
        }

        HashSet<Integer> set = new HashSet<>();
        int deletion = 0;
        for(int freq : hash){
            while(freq>0 && set.contains(freq)){
                deletion++;
                freq--;
            }

            if(freq>0){
                set.add(freq);
            }
        }
        return deletion;
    }
}