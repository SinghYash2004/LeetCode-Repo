class MyLinkedList {
    private static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;
        if (index < size / 2) {
            temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;

            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        if(size==0){
            head = node;
            tail = head;
        }else{
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if(size==0){
            head = tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0){
            addAtHead(val);
        }else if(index==size){
            addAtTail(val);
        }else{
            Node node = new Node(val);
            if(index<size/2){
                Node temp = head;
                for(int i = 0; i<index-1; i++){
                    temp = temp.next;
                }
                node.next = temp.next;
                node.prev = temp;
                temp.next.prev = node;
                temp.next = node;
            }else{
                Node temp = tail;
                for(int i = size-1; i>=index; i--){
                    temp = temp.prev;
                }
                node.next = temp.next;
                node.prev = temp;
                temp.next.prev = node;
                temp.next = node;
            }
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if (size == 1) {
            head = null;
            tail = null;
        }else if(index == 0){
            head.next.prev = null;
            head = head.next;
        }else if(index == size-1){
            tail.prev.next = null;
            tail = tail.prev;
        }else{
            if(index<size/2){
                Node temp = head;
                for(int i = 0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
            }else{
                Node temp = tail;
                for(int i = size-1; i>=index; i--){
                    temp = temp.prev;
                }
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */