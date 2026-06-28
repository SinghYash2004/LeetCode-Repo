class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> list = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while(i<j && !list.contains(arr[i])) {
                i++;
            }
            while (i<j && !list.contains(arr[j])) {
                j--;
            }
            if (list.contains(arr[i]) && list.contains(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        String ans = new String(arr);
        return ans;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}