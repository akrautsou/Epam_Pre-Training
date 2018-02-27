package by.epam.preTraining.krautsou.tasks.task6.code.customStackQueue;

import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomException;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomStack;

public class CustomStackQueue {

    public CustomStackQueue() {
    }

    private CustomStack customStack = new CustomStack(1);

    public void push(Object... value) {
        customStack.push(value);
    }

    public Object pop() throws CustomException {
        if (!customStack.isEmpty())
            return customStack.pop();
        return null;
    }

    public boolean isFull() {
        return customStack.isFull();
    }

    public Object peek() throws CustomException {
        return customStack.peek();
    }

    public boolean isEmpty() {
        return customStack.isEmpty();
    }

    public int size() {
        return customStack.size();
    }

    public Object getArrayIndex(int index) {
        return customStack.getArrayIndex(index);
    }

    public int getNumberOfElements() {
        return customStack.getNumberOfElements();
    }
}
