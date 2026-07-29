class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i>=0){
            if(digits[i]<=8){
                digits[i--]++;
                return digits;
            }else if(digits[i]==9){
                digits[i--]=0;
            }
        }
        int[] arr = new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}