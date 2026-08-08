class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0;
        int i = 0;
        while(n>0){
            int digit = n%10;
            sum += digit;
            if(digit!=0){
                num  += digit * Math.pow(10, i++);
            }
            n = n/10;
        }
        return num*sum;
    }
}