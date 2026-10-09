class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {
            if (stack.empty()) {
                stack.push(num);
            } else {
                if (stack.peek() > 0 && num > 0) {
                    stack.push(num);
                } else if (stack.peek() < 0 && num < 0) {
                    stack.push(num);
                }else{
                    boolean alive = true;
                    while(!stack.empty() && stack.peek()>0 && num<0){
                        if(stack.peek() > Math.abs(num)){
                            alive = false;
                            break;
                        }else if(stack.peek() == Math.abs(num)){
                            alive = false;
                            stack.pop();
                            break;
                        }else{
                            stack.pop();
                        }
                    }

                    if(alive){
                        stack.push(num);
                    }
                }
            }
        }

        int[] arr = new int[stack.size()];
        int i = stack.size() - 1;

        while (!stack.empty()) {
            arr[i--] = stack.pop();
        }

        return arr;
    }
}