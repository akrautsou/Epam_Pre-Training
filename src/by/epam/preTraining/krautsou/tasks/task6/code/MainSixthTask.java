package by.epam.preTraining.krautsou.tasks.task6.code;

import by.epam.preTraining.krautsou.tasks.task6.code.customQueue.CustomArrayQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.customQueue.LinkListQueue;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.CustomArrayStack;
import by.epam.preTraining.krautsou.tasks.task6.code.customStack.LinkListStack;
import by.epam.preTraining.krautsou.tasks.task6.code.palindrome.PalindromeChecker;
import by.epam.preTraining.krautsou.tasks.task6.code.viewer.Viewer;

public class MainSixthTask {
    private static Viewer viewer = new Viewer();

    public static void main(String[] args) {
        viewer.output(PalindromeChecker.isPalindrome("KUULILENNUTEETUNNELILUUK", new CustomArrayStack(1)));
        stack();
        queue();
        linkListQueue();
        linkListStack();
    }

    private static void linkListQueue() {
        LinkListQueue linkQueue = new LinkListQueue();
        linkQueue.enqueue("A");
        linkQueue.enqueue("B");
        linkQueue.enqueue("C");
        linkQueue.enqueue("D");
        viewer.output(linkQueue.displayList());
        viewer.output(linkQueue.dequeue());
        viewer.output(linkQueue.peek());
        viewer.output(linkQueue.getSize());
        viewer.output(linkQueue.displayList());
    }

    private static void queue() {
        CustomArrayQueue customArrayQueue = new CustomArrayQueue(1);
        customArrayQueue.enqueue(10);
        customArrayQueue.enqueue(20);
        customArrayQueue.enqueue(30);
        viewer.output(customArrayQueue.isEmpty());
        viewer.output(customArrayQueue.isFull());
        viewer.output(customArrayQueue.peek());
        viewer.output(customArrayQueue.dequeue());
        viewer.output(customArrayQueue.displayList());
    }

    private static void stack() {
        CustomArrayStack customStackQueue = new CustomArrayStack(1);
        customStackQueue.push(0);
        customStackQueue.push(1);
        customStackQueue.push(2);
        customStackQueue.push(3);
        viewer.output(customStackQueue.displayList());
        viewer.output(customStackQueue.peek());
        viewer.output(customStackQueue.getSize());
        viewer.output(customStackQueue.isFull());
        viewer.output(customStackQueue.isEmpty());
        viewer.output(customStackQueue.pop());
        viewer.output(customStackQueue.displayList());
    }

    private static void linkListStack() {
        LinkListStack st = new LinkListStack();
        st.push(75);
        st.push(70);
        st.push(190);
        viewer.output(st.displayList());
        st.pop();
        viewer.output(st.displayList());
        viewer.output(st.peek());
        viewer.output(st.getSize());
        viewer.output(st.pop());
        viewer.output(st.getSize());
        viewer.output(st.displayList());
        st.pop();
        viewer.output(st.isEmpty());
    }
}
