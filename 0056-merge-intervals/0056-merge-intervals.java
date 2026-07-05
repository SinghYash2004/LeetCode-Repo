class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        List<int[]> list = new ArrayList<>();
        while(i<intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(i+1<intervals.length && intervals[i+1][0]<=end){
                i++;
                end = Math.max(end, intervals[i][1]);
            }
            list.add(new int[]{start, end});
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}