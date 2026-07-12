class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        int rank = 1;

        while (!pq.isEmpty()) {
            int num = pq.poll();

            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}