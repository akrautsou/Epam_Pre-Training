package by.epam.preTraining.krautsou.tasks.task6.code.customArrayQueue;

import by.epam.preTraining.krautsou.tasks.task6.code.customQueue.CustomQueue;

public class CustomArrayQueue {

    public CustomArrayQueue() {
    }

    private CustomQueue customQueue = new CustomQueue(1);

    public void enqueue(int value) {
        customQueue.enqueue(value);
    }

    public Object dequeue() {
        if (!customQueue.isEmpty())
            return customQueue.dequeue();
        return null;
    }

    public boolean isFull() {
        return customQueue.isFull();
    }

    public Object peek() {
        return customQueue.peek();
    }

    public boolean isEmpty() {
        return customQueue.isEmpty();
    }

    public int size() {
        return customQueue.customSize();
    }

    public int getArrayIndex(int index) {
        return customQueue.getArrayIndex(index);
    }
}
