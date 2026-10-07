class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {
            if (stack.empty()) {
                stack.push(num);
            } else {
                if (num > 0 && stack.peek() > 0) {
                    stack.push(num);
                } else if (num < 0 && stack.peek() < 0) {
                    stack.push(num);
                } else {
                    boolean alive = true;

                    while (!stack.empty() && stack.peek() > 0 && num < 0) {
                        int num1 = stack.pop();

                        if (num1 == Math.abs(num)) {
                            alive = false;
                            break;
                        } 
                        else if (num1 < Math.abs(num)) {
                            alive = true;
                        } 
                        else {
                            stack.push(num1);
                            alive = false;
                            break;
                        }
                    }

                    if (alive) {
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