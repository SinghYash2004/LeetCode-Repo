class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s:operations){
            char ch = s.charAt(0);
            if(ch == '+'){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a+b);
            }else if(ch == 'C'){
                stack.pop();
            }else if(ch == 'D'){
                stack.push(2*stack.peek());
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        int total = 0;
        while(!stack.empty()){
            total += stack.pop();
        }

        return total;
    }
}