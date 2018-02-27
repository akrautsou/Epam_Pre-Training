package by.epam.preTraining.krautsou.tasks.task6.code;

import by.epam.preTraining.krautsou.tasks.task6.code.customLinkedListQueue.LinkListQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.palindrome.PalindromeChecker;
import by.epam.preTraining.krautsou.tasks.task6.code.customQueue.CustomQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.viewer.Viewer;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomException;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomStack;

public class MainSixthTask {
    private static Viewer viewer = new Viewer();
    private static PalindromeChecker palindromeCheck = new PalindromeChecker();
    private static CustomStack customStack = new CustomStack(0);
    private static CustomQueue customQueue = new CustomQueue(0);

    public static void Stack() throws CustomException {
        customStack = new CustomStack(1);
        customStack.push(0);
        customStack.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        for (int i = 0; i < customStack.getNumberOfElements(); i++) {
            viewer.output(customStack.getArrayIndex(i));
        }
        System.out.println("____________");
        viewer.output(customStack.peek());
        viewer.output(customStack.customSize());
        viewer.output(customStack.isFull());
        viewer.output(customStack.customIsEmpty());
        viewer.output(customStack.pop());
        System.out.println("____________");
        for (int i = 0; i < customStack.getNumberOfElements(); i++) {
            viewer.output(customStack.getArrayIndex(i));
        }
    }


    public static void main(String[] args) throws CustomException {
      //viewer.output(PalindromeChecker.isPalindrome("KUULILENNUTEETUNNELILUUK", customStack));
      //Stack();
      Queue();
      //LinkListQueue();
    }

    private static void LinkListQueue() {
        LinkListQueue queueImpl = new LinkListQueue();
        viewer.output(queueImpl.isEmpty());
        queueImpl.enqueue("A");
        queueImpl.enqueue("B");
        queueImpl.enqueue("C");
        queueImpl.enqueue("D");
        viewer.output(queueImpl.displayQueue());
        queueImpl.dequeue();
        viewer.output(queueImpl.displayQueue());
    }

    private static void Queue() {
        customQueue = new CustomQueue(1);
        customQueue.enqueue(10);
        customQueue.enqueue(20);
        customQueue.enqueue(30);
        viewer.output(customQueue.isEmpty());
        viewer.output(customQueue.isFull());
        viewer.output(customQueue.peek());
        viewer.output(customQueue.dequeue());
        for (int i = 0; i < customQueue.customSize(); i++) {
            System.out.println(customQueue.getArrayIndex(i));
        }


    }

}
