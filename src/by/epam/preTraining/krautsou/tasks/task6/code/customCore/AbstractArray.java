package by.epam.preTraining.krautsou.tasks.task6.code.customCore;

import by.epam.preTraining.krautsou.tasks.task6.code.IList;

public abstract class AbstractArray implements IList {
    protected static final int EMPTY_ELEMENT = -1;
    protected int capacity;
    protected int numberOfElements = 0;
    protected Object[] array;

    public AbstractArray(int inCapacity) {
        this.capacity = inCapacity;
        array = new Object[inCapacity];
    }

    @Override
    public int getSize() {
        return numberOfElements;
    }

    @Override
    public boolean isFull() {
        return numberOfElements == capacity;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == EMPTY_ELEMENT;
    }

    @Override
    public Object peek() {
        if (numberOfElements == EMPTY_ELEMENT) return null;//throw new CustomException("Empty");
        return array[numberOfElements - 1];
    }

    @Override
    public String displayList() {
        StringBuilder result = new StringBuilder();
        int size = getSize();
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
        }
        return result.toString();
    }

}
