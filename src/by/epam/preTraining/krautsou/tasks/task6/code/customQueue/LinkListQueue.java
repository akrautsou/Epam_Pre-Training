package by.epam.preTraining.krautsou.tasks.task6.code.customQueue;

import by.epam.preTraining.krautsou.tasks.task6.code.IQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.customCore.AbstractLinkList;

public class LinkListQueue extends AbstractLinkList implements IQueue {

    @Override
    public void enqueue(Object data) {
        addLast(data);
    }

    @Override
    public Object dequeue() {
        if (!isEmpty())
            return removeFirst();
        return null;
    }

}