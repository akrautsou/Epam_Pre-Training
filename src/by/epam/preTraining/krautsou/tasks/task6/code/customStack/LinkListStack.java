package by.epam.preTraining.krautsou.tasks.task6.code.customStack;

import by.epam.preTraining.krautsou.tasks.task6.code.IStack;
import by.epam.preTraining.krautsou.tasks.task6.code.customCore.AbstractLinkList;

public class LinkListStack extends AbstractLinkList implements IStack {

    @Override
    public void push(Object data) {
        addFirst(data);
    }

    @Override
    public Object pop() {
        if (!isEmpty())
            return removeFirst();
        return null;
    }

}