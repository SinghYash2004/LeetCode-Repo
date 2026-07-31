class Solution {
    public int minimumPushes(String word) {
        int hash[] = new int[26];
        for (int i = 0; i < word.length(); i++) {
            hash[word.charAt(i) - 'a']++;
        }
        Arrays.sort(hash);

        int n = 1;
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            if (hash[i] >= 1) {
                if (n <= 8) {
                    count += (hash[i]);
                } else if (n > 8 && n <= 16) {
                    count += (hash[i] * 2);
                } else if (n > 16 && n <= 24) {
                    count += (hash[i] * 3);
                } else {
                    count += (hash[i] * 4);
                }
                n++;
            }
        }
        return count;
    }
}