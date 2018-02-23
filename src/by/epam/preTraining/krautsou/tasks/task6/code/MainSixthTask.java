package by.epam.preTraining.krautsou.tasks.task6.code;

import by.epam.preTraining.krautsou.tasks.task6.code.customQueue.CustomQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.viewer.Viewer;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomException;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomStack;

public class MainSixthTask {
    private static Viewer viewer = new Viewer();

    public static void Stack() throws CustomException {
        CustomStack customStack = new CustomStack(10);
        customStack.push(1);
        customStack.push(1, 2, 3, 3);
        for (int i = 0; i < customStack.getCapacity(); i++) {
            viewer.output(customStack.getArrayIndex(i));
        }
        viewer.output(customStack.peek());
        viewer.output(customStack.customSize());
        viewer.output(customStack.isFull());
        viewer.output(customStack.customIsEmpty());
        viewer.output(customStack.pop());
        for (int i = 0; i < customStack.getCapacity(); i++) {
            viewer.output(customStack.getArrayIndex(i));
        }
    }


    public static void main(String[] args) throws CustomException {
        //Stack();
        Queue();
    }

    private static void Queue() {
        CustomQueue customQueue = new CustomQueue(10);
        customQueue.enqueue(10);
        customQueue.enqueue(20);
        customQueue.enqueue(30);
        viewer.output(customQueue.isEmpty());
        viewer.output(customQueue.isFull());

        viewer.output(customQueue.peek());
        for (int i = 0; i < customQueue.customSize(); i++) {
            System.out.println(customQueue.getArrayIndex(i));
        }


    }

}
