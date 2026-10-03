class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
        //queue ke interface hai isiliye uska direct object nhi banaya jaa sakta hai
    }
    
    public void push(int x) {
        queue.add(x);
        for(int i = 0; i<queue.size()-1; i++){
            //main logic ye hai ki stack mein hamesha LIFO follow hota hai isiliye hume queue ko aisa banana padega ki jo new element enter hua hai wo hamesha queue ke front pe rahe kyuki queue pe element hamesha front se hi nikalna hai, isiliye hum new element ko rear pe add karne ke baad purane elements ek ek karke nikalenge front se aur un elements ko rear par add karte jayene jisse last mein hamara newly added element aa jayega front pe, jisse hoga ye ki jab bhi pop() call hoga stack ka toh hamesha newly added element hi remove hoga.
            queue.add(queue.poll());
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */