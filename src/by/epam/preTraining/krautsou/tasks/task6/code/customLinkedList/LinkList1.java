package by.epam.preTraining.krautsou.tasks.task6.code.customLinkedList;

public class LinkList1 {
    private Node first = null;

    private static class Node {

        private final Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public String displayNode() {
            return (data + " ");
        }

    }

    public void addFirst(Object data) {
        Node n = new Node(data);
        n.next = first;
        first = n;
    }

    public Object removeFirst() {
        Object temp = first.data;
        first = first.next;
        return temp;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //public boolean isFull() {return first.next == null;}

    public Object peek() {
        return first.data;
    }

    public StringBuilder displayList() {
        StringBuilder result = new StringBuilder();
        Node current = first;
        while (current != null) {
            result.append(current.displayNode());
            current = current.next;
        }
        return result;
    }

    public int getSize() {
        int size = 0;
        Node current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}