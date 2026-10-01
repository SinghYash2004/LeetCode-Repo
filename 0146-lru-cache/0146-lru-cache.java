class LRUCache {

    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    HashMap<Integer, Node> map = new HashMap<>();
    Node head;
    Node tail;
    int capacity;
    int currSize;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.currSize = 0;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        if (node != tail) {
            if (node == head) {
                head = head.next;
            } else {
                node.prev.next = node.next;
            }

            node.next.prev = node.prev;

            node.prev = tail;
            node.next = null;
            tail.next = node;
            tail = node;
        }

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            if (node != tail) {
                if (node == head) {
                    head = head.next;
                } else {
                    node.prev.next = node.next;
                }

                node.next.prev = node.prev;

                node.prev = tail;
                node.next = null;
                tail.next = node;
                tail = node;
            }
            return;
        }

        if (currSize == capacity) {
            map.remove(head.key);
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head.next.prev = null;
                head = head.next;
            }
            currSize--;
        }

        Node node = new Node(key, value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }

        map.put(key, node);
        currSize++;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */