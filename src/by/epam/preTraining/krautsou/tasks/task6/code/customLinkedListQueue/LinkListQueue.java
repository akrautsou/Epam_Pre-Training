package by.epam.preTraining.krautsou.tasks.task6.code.customLinkedListQueue;

import by.epam.preTraining.krautsou.tasks.task6.code.customLinkedList.LinkList;

public class LinkListQueue {

    private LinkList list = new LinkList();

    public <T> void enqueue(T data) {
        list.addLast(data);
    }

    public Object dequeue() {
        if (!list.isEmpty())
            return list.removeFirst();
        return null;
    }

    //public boolean isFull(){return list.isFull();}

    public Object peek() {
        return list.peek();
    }

    public StringBuilder displayQueue() {
        return list.displayList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.getSize();
    }

}