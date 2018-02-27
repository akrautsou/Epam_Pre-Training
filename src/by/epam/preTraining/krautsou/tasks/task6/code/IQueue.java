package by.epam.preTraining.krautsou.tasks.task6.code;

public interface IQueue extends IList {
    void enqueue(Object data);

    Object dequeue();
}
