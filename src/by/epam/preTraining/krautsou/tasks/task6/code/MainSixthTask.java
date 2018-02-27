package by.epam.preTraining.krautsou.tasks.task6.code;

import by.epam.preTraining.krautsou.tasks.task6.code.customArrayQueue.CustomArrayQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.customLinkedListQueue.LinkListQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.customLinkedListStack.LinkListStack;
import by.epam.preTraining.krautsou.tasks.task6.code.customStackQueue.CustomStackQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.palindrome.PalindromeChecker;
import by.epam.preTraining.krautsou.tasks.task6.code.viewer.Viewer;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomException;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomStack;

public class MainSixthTask {
    private static Viewer viewer = new Viewer();
    private static CustomStack customStack = new CustomStack(0);

    public static void main(String[] args) throws CustomException {
        viewer.output(PalindromeChecker.isPalindrome("KUULILENNUTEETUNNELILUUK", customStack));
        Stack();
        Queue();
        LinkListQueue();
        LinkListStack();
    }

    private static void LinkListQueue() {
        LinkListQueue linkQueue = new LinkListQueue();
        viewer.output(linkQueue.isEmpty());
        linkQueue.dequeue();
        linkQueue.enqueue("A");
        linkQueue.enqueue("B");
        linkQueue.enqueue("C");
        linkQueue.enqueue("D");
        viewer.output(linkQueue.displayQueue());
        viewer.output(linkQueue.dequeue());
        //viewer.output(linkQueue.isFull());
        viewer.output(linkQueue.peek());
        viewer.output(linkQueue.size());
        viewer.output(linkQueue.displayQueue());

    }

    private static void Queue() {
        CustomArrayQueue customArrayQueue = new CustomArrayQueue();
        customArrayQueue.enqueue(10);
        customArrayQueue.enqueue(20);
        customArrayQueue.enqueue(30);
        viewer.output(customArrayQueue.isEmpty());
        viewer.output(customArrayQueue.isFull());
        viewer.output(customArrayQueue.peek());
        viewer.output(customArrayQueue.dequeue());
        for (int i = 0; i < customArrayQueue.size(); i++) {
            System.out.println(customArrayQueue.getArrayIndex(i));
        }


    }

    private static void Stack() throws CustomException {
        CustomStackQueue customStackQueue = new CustomStackQueue();
        customStackQueue.push(0);
        customStackQueue.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        for (int i = 0; i < customStackQueue.getNumberOfElements(); i++) {
            viewer.output(customStackQueue.getArrayIndex(i));
        }
        viewer.output(customStackQueue.peek());
        viewer.output(customStackQueue.size());
        viewer.output(customStackQueue.isFull());
        viewer.output(customStackQueue.isEmpty());
        viewer.output(customStackQueue.pop());
        for (int i = 0; i < customStackQueue.getNumberOfElements(); i++) {
            viewer.output(customStackQueue.getArrayIndex(i));
        }
    }

    private static void LinkListStack() {
        LinkListStack st = new LinkListStack();
        st.push(75);
        st.push(70);
        st.push(190);
        viewer.output(st.displayQueue());
        st.pop();
        viewer.output(st.displayQueue());
        //viewer.output(st.isFull());
        viewer.output(st.peek());
        viewer.output(st.size());
        viewer.output(st.pop());
        viewer.output(st.size());
        viewer.output(st.displayQueue());
        st.pop();
        viewer.output(st.isEmpty());
    }
}
