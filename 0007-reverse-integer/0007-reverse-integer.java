class Solution {
    public int reverse(int x) {
        long num = Math.abs((long) x);
        long rev =0;
        while(num>0){
            rev = (rev*10) + (num%10);
            num = num/10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
        if(x<0) return (int) -rev;
        return (int) rev;
    }
}