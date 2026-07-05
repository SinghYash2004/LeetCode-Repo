class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        boolean inserted = false;

        while (i < n) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!inserted && newInterval[1] < start) {
                list.add(newInterval);
                inserted = true;
            }

            if (!inserted && start <= newInterval[1] && newInterval[0] <= end) {
                start = Math.min(start, newInterval[0]);
                end = Math.max(end, newInterval[1]);

                while (i + 1 < n && end >= intervals[i + 1][0]) {
                    i++;
                    end = Math.max(end, intervals[i][1]);
                }

                list.add(new int[] { start, end });
                inserted = true;
            } else {
                list.add(new int[] { start, end });
            }

            i++;
        }

        if (!inserted) {
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][]);
    }
}