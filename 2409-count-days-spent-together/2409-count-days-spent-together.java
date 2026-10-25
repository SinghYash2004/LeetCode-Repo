class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysinMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aStart = days(arriveAlice, daysinMonth);
        int aEnd = days(leaveAlice, daysinMonth);
        int bStart = days(arriveBob, daysinMonth);
        int bEnd = days(leaveBob, daysinMonth);

        int start = Math.max(aStart, bStart);
        int end = Math.min(aEnd, bEnd);

        if(start <= end) return end-start+1;
        else return 0;
    }

    public int days(String date, int[] daysinMonth){
        int month = (date.charAt(0)-'0') * 10 + (date.charAt(1)-'0');
        int day = (date.charAt(3)-'0') * 10 + (date.charAt(4)-'0');
        int result = day;

        for(int i = 0; i<month-1; i++){
            result += daysinMonth[i];
        }

        return result;
    }
}