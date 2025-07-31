class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int data) {
            this.val = data;
        }
    }

    Node head = null, tail = null;
    int size = 0;

    public MyLinkedList() {}

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node nw = new Node(val);
        if (head == null) {
            head = tail = nw;
        } else {
            nw.next = head;
            head = nw;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node nw = new Node(val);
        if (tail == null) {
            head = tail = nw;
        } else {
            tail.next = nw;
            tail = nw;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) index = 0;
        if (index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node nw = new Node(val);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        nw.next = temp.next;
        temp.next = nw;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (index == size - 1) tail = temp;
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