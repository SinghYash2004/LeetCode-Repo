class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(n==1){
            return map.get(s.charAt(0));
        }

        int i =0;
        int num = 0;

        while(i<n-1){
            int num1 = map.get(s.charAt(i));
            int num2 = map.get(s.charAt(i+1));
            if(num1<num2){
                num+=(num2-num1);
                i+=2;
            }else{
                num+=num1;
                i++;
            }
        }
        if(map.get(s.charAt(n-1))<=map.get(s.charAt(n-2))){
            num+=map.get(s.charAt(n-1));
        }
        return num;
    }
}