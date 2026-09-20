class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = 200;
        int min2 = 200;

        for(int num:prices){
            if(min1>num){
                min2 = min1;
                min1 = num;
            }else if(min2>num){
                min2 = num;
            }
        }

        if(min1+min2 > money) return money;
        return money-(min1+min2);
    }
}