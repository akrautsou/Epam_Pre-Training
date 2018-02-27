package by.epam.preTraining.krautsou.tasks.task6.code.customLinkedListStack;

import by.epam.preTraining.krautsou.tasks.task6.code.customLinkedList.LinkList1;

public class LinkListStack {

    private LinkList1 linkedList = new LinkList1();

    public void push(Object data) {
        linkedList.addFirst(data);
    }

    public Object pop() {
        return linkedList.removeFirst();
    }

    //public boolean isFull(){return linkedList.isFull();}

    public Object peek() {
        return linkedList.peek();
    }

    public StringBuilder displayQueue() {
        return linkedList.displayList();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.getSize();
    }
}