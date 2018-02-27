package by.epam.preTraining.krautsou.tasks.task6.code.customCore;

import by.epam.preTraining.krautsou.tasks.task6.code.IList;

public abstract class AbstractLinkList implements IList {

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

    private Node first = null;
    private Node last = null;

    protected void addFirst(Object data) {
        Node n = new Node(data);
        n.next = first;
        first = n;
    }

    protected void addLast(Object data) {
        Node n = new Node(data);
        if (isEmpty()) {
            first = n;
        } else {
            last.next = n;
        }
        last = n;
        last.next = null;
    }

    protected Object removeFirst() {
        if (first.next == null) {
            last = null;
        }
        Object temp = first.data;
        first = first.next;
        return temp;
    }

    @Override
    public Object peek() {
        return first.data;
    }

    @Override
    public String displayList() {
        StringBuilder result = new StringBuilder();
        Node current = first;
        while (current != null) {
            result.append(current.displayNode());
            current = current.next;
        }
        return result.toString();
    }

    @Override
    public int getSize() {
        int size = 0;
        Node current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }

}
