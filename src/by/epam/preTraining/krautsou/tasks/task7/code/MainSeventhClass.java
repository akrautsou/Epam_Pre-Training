package by.epam.preTraining.krautsou.tasks.task7.code;

import by.epam.preTraining.krautsou.tasks.task6.code.viewer.Viewer;
import by.epam.preTraining.krautsou.tasks.task7.code.customBinaryTree.BinaryTree;

import java.util.Random;

public class MainSeventhClass {
    private static Viewer viewer = new Viewer();

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        viewer.output(binaryTree.output());
        addValues(binaryTree, 5);
        viewer.output(binaryTree.output());
        viewer.output(binaryTree.preorder());
        viewer.output(binaryTree.postorder());
        viewer.output("Size " + binaryTree.size());
        binaryTree.add(47);
        viewer.output(binaryTree.output());
        viewer.output("47? " + binaryTree.contains(47));
        binaryTree.remove(47);
        viewer.output(binaryTree.output());
        viewer.output("47?: " + binaryTree.contains(47));
        binaryTree.clear();
        viewer.output("Size" + binaryTree.size());
    }

    private static void addValues(BinaryTree binaryTree, int number) {
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            binaryTree.add(rand.nextInt(100));
        }
    }

}
