class Solution {
    public int reverseDegree(String str) {
        int sum = 0;
        for(int index = 0; index<str.length(); index++){
            char ch = str.charAt(index);
            int prod = (26 - (ch-'a'))*(index+1);
            sum+=prod;
        }
        return sum;
    }
}