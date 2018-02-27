package by.epam.preTraining.krautsou.tasks.task6.code.customLinkedList;

public class LinkList {

    private static class Node<T> {

        private final T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }


        public String displayNode() {
            return (data + " ");
        }

    }

    private Node first = null;
    private Node last = null;

    public boolean isEmpty() {
        return (first == null);
    }

    //public boolean isFull() {return last.next == null;}

    public <T> void addLast(T data) {
        Node n = new Node(data);
        if (isEmpty()) {
            first = n;
        } else {
            last.next = n;
        }
        last = n;
        last.next = null;

    }

    public Object removeFirst() {
        if (first.next == null) {
            last = null;
        }
        Object temp = first.data;
        first = first.next;
        return temp;
    }

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
