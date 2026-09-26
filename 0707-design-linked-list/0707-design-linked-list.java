class MyLinkedList {

    int val;
    MyLinkedList next;

    public MyLinkedList() {
        this.next = null;
    }

    public MyLinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    MyLinkedList head;

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        MyLinkedList temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (index >= len)
            return -1;
        temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        MyLinkedList temp = new MyLinkedList(val);
        temp.next = head;
        head = temp;
    }

    public void addAtTail(int val) {
        MyLinkedList newNode = new MyLinkedList(val);

        if (head == null) {
            head = newNode;
            return;
        }

        MyLinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList temp = head;
        MyLinkedList newNode = new MyLinkedList(val);
        if(index == 0){
            addAtHead(val);
            return;
        }

        if(head == null) return;

        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(index>len) return;
        if(index == len){
            addAtTail(val);
            return;
        }
        temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        MyLinkedList temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null)
                return;
            temp = temp.next;
        }

        if (temp.next == null)
            return;

        temp.next = temp.next.next;
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