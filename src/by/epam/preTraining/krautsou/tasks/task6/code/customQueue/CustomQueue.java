package by.epam.preTraining.krautsou.tasks.task6.code.customQueue;

public class CustomQueue {

    private int[] queue;
    private int head;
    private int tail;
    private int capacity;
    private int numberOfElem = 0;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        head = 0;
    }

    public void enqueue(int element) {
        if (tail == capacity - 1) {
            tail = -1;
        }
        if (numberOfElem < capacity) {
            int[] tempArray = queue;
            queue = new int[++capacity];
            for (int i = 0; i < tempArray.length; i++) {
                queue[i] = tempArray[i];
            }
            queue[numberOfElem++] = element;
        } else {
            queue[numberOfElem++] = element;
        }
    }

    public int dequeue() {
        int temp = queue[head];
        for (int i = head; i < numberOfElem; i++) {
            queue[i] = queue[i + 1];
        }
        numberOfElem--;
        return temp;
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

}
