class MinStack {

    class Node{
        int value;
        int min;
        Node next;

        public Node(int value, int min){
            this.value = value;
            this.min = min;
            this.next = null;
        }
    }
    Node head;
    
    public MinStack() {
        head = null;
    }
    
    public void push(int value) {
        if(head == null){
            Node node = new Node(value, value);
            head = node;
        }else{
            Node node = new Node(value, Math.min(value, head.min));
            node.next = head;
            head = node;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.min;
    }
}
