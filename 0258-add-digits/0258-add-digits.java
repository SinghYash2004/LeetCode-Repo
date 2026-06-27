class Solution {
    public int addDigits(int num) {
        int digit;
        while(num>9){
            int sum = 0;
            while(num>0){
                digit = num%10;
                sum += digit;
                num /= 10;
            }
            if(sum<=9){
                return sum;
            }else{
                num = sum;
            }
        }return num;
    }
}