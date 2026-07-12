import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] pq = arr.clone();
        Arrays.sort(pq);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int x : pq) {
            if (!map.containsKey(x)) {
                map.put(x, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}