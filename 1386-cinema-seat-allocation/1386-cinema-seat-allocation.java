class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            map.merge(seat[0], 1 << seat[1], (a, b) -> a | b);
        }

        int count = 2 * n;

        int left = 0b00111100;
        int middle = 0b11110000;
        int right = 0b1111000000;

        for (int mask : map.values()) {
            boolean l = (mask & left) == 0;
            boolean m = (mask & middle) == 0;
            boolean r = (mask & right) == 0;

            if (l && r) {
                continue;
            }

            count -= (l || m || r) ? 1 : 2;
        }

        return count;
    }
}