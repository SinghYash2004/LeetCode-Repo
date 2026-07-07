class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int num = 0;
        int i = 0;
        while(n>0){
            int digit = n %10;
            if(digit != 0){
                sum+=digit;
                num += digit * Math.pow(10, i++);
            }
            n/=10;
        }
        return (long) sum * num;
    }
}