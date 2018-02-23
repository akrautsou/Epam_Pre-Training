package by.epam.preTraining.krautsou.tasks.task6.code.customQueue;

import java.awt.*;

public class CustomQueue extends List {
    private int[] queue;
    private int head;
    private int tail;
    private int capacity;
    private int numberOfElem;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        head = 0;
        tail = -1;
    }

    public void enqueue(int element) {
        if (tail == capacity - 1) {  //
            tail = -1;
        }
        queue[++tail] = element;
        numberOfElem++;
    }

    public void enqueue(int... element) {

    }

    public int dequeue() { //unfinished
        if (capacity == 0) {
            head = 0;
        }
        return 0;
    }

    public int peek() {
        return queue[head];
    }

    public int getArrayIndex(int index) {
        return queue[index];
    }

    public boolean isEmpty() {
        return (numberOfElem == 0);
    }

    public boolean isFull() {
        return numberOfElem == (capacity - 1);
    }

    public int customSize() {
        return numberOfElem;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getQueue() {
        return queue;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }
}
