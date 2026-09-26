class MyLinkedList {

    private static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int current_size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.current_size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= current_size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        if (current_size == 0) {
            tail = head;
        }

        current_size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (current_size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        current_size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > current_size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == current_size) {
            addAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;

        current_size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= current_size) {
            return;
        }

        if (current_size == 1) {
            head = null;
            tail = null;
        }

        else if (index == 0) {
            head = head.next;
        }

        else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            if (index == current_size - 1) {
                temp.next = null;
                tail = temp;
            } else {
                temp.next = temp.next.next;
            }
        }

        current_size--;
    }
}