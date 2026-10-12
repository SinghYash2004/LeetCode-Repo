class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()) return new String("0");

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<num.length(); i++){
            char ch = num.charAt(i);

            while(!stack.empty() && k>0 && stack.peek() > ch){
                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        while(k>0){
            stack.pop();
            k--;
        }
        
        if(stack.empty()) return new String("0");

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }

        sb.reverse();

        int i = 0;
        while(i<sb.length() && sb.charAt(i) == '0'){
            i++;
        }

        if(i == sb.length()){
            return "0";
        }

        return sb.substring(i);
    }
}