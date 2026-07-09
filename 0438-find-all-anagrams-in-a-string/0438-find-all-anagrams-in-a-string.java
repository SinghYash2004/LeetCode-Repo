class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list =  new ArrayList<>();
        if(p.length()>s.length()){
            return list;
        }
        int[] pfreq = new int[26];
        for(int i = 0; i<p.length(); i++){
            pfreq[p.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = left + p.length();

        int[] sfreq = new int[26];
        for(int i = left; i<right; i++){
            sfreq[s.charAt(i) - 'a']++;
        }

        while(right<=s.length()){
            if(Arrays.equals(pfreq, sfreq)){
                list.add(left);
            }

            if(right == s.length()){
                break;
            }

            sfreq[s.charAt(left++) - 'a']--;
            sfreq[s.charAt(right++) - 'a']++;
        }
        return list;
    }
}