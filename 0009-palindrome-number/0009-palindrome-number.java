class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int nums= x;
        int digits = 0;
        while(nums>0){
            digits++;
            nums = nums/10;
        }

        int i = 0;
        int num = 0;
        int n = x;
        while(x>0){
            int digit = x % 10;
            num = num + (int)(digit*Math.pow(10, digits-1));
            digits--;
            x=x/10;
        }

        return num==n;
    }
}