class Solution {

    public long countCommas(long num) {

        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= num) {

            long end = start * 1000 - 1;

            if (num < end) {
                end = num;
            }

            long count = end - start + 1;

            ans += count * commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }
}