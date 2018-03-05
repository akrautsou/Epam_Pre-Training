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
        viewer.output(linkQueue.dequeue());
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
        viewer.output(customArrayQueue.dequeue());
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
        CustomArrayStack customArrayStack = new CustomArrayStack(1);
        viewer.output(customArrayStack.pop());
        customArrayStack.push(0);
        customArrayStack.push(1);
        customArrayStack.push(2);
        customArrayStack.push(3);
        viewer.output(customArrayStack.displayList());
        viewer.output(customArrayStack.peek());
        viewer.output(customArrayStack.getSize());
        viewer.output(customArrayStack.isFull());
        viewer.output(customArrayStack.isEmpty());
        viewer.output(customArrayStack.pop());
        viewer.output(customArrayStack.displayList());
    }

    private static void linkListStack() {
        LinkListStack st = new LinkListStack();
        viewer.output(st.pop());
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
