package by.epam.preTraining.krautsou.tasks.task6.code.customStack;

import by.epam.preTraining.krautsou.tasks.task6.code.IStack;
import by.epam.preTraining.krautsou.tasks.task6.code.customCore.AbstractArray;

public class CustomArrayStack extends AbstractArray implements IStack {

    public CustomArrayStack(int capacity) {
        super(capacity);
    }

    @Override
    public void push(Object element) {
        addElement(element);
    }

    @Override
    public Object pop() {
        if (numberOfElements == 0) return null;
        Object temp = array[numberOfElements - 1];
        array[numberOfElements - 1] = null;
        numberOfElements--;
        return temp;
    }

}
