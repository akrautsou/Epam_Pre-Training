package by.epam.preTraining.krautsou.tasks.task6.code.customQueue;

import by.epam.preTraining.krautsou.tasks.task6.code.IQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.customCore.AbstractArray;

public class CustomArrayQueue extends AbstractArray implements IQueue {

    public CustomArrayQueue(int capacity) {
        super(capacity);
    }

    @Override
    public void enqueue(Object element) {
        addElement(element);
    }

    @Override
    public Object dequeue() {
        Object temp = array[0];
        if (numberOfElements == 0) return null;
        System.arraycopy(array, 1, array, 0, numberOfElements - 1);
        array[numberOfElements - 1] = null;
        numberOfElements--;
        return temp;
    }

}
