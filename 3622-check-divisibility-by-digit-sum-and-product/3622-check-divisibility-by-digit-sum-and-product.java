class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int num = n;
        while(num>0){
            int digit = num%10;
            sum += digit;
            prod *= digit;
            num/=10;
        }
        int total = sum + prod;
        return n%total == 0;
    }
}