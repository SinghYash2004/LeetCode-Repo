class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(calculate(b, a, s.charAt(0)));
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();

    }

    int calculate(int a, int b, char op) {
    switch (op) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            return a / b;
        default:
            return 0;
    }
}
}