package by.epam.preTraining.krautsou.tasks.task8.code;

import by.epam.preTraining.krautsou.tasks.task8.code.search.Searcher;
import by.epam.preTraining.krautsou.tasks.task8.code.sorterer.Sorter;
import by.epam.preTraining.krautsou.tasks.task8.code.viewer.Viewer;

import java.util.Random;

public class MainEighthTask {
    private static final int NUMBER = 5;

    public static void main(String[] args) {
        int[] a = new int[NUMBER];
        int[] b = new int[NUMBER];
        Random rand = new Random();
        for (int i = 0; i < NUMBER; i++) {
            a[i] = rand.nextInt(100);
        }
        for (int i = 0; i < NUMBER; i++) {
            b[i] = rand.nextInt(100);
        }
        Viewer.output("Array A\n");
        for (int anA : a) {
            Viewer.output(anA);
        }
        Viewer.output("\nArray B\n");
        for (int aB : b) {
            Viewer.output(aB);
        }
        Viewer.output("\nMergeSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.mergeSort(a)[i]);
        }
        Viewer.output("\nCountSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.countSort(a)[i]);
        }
        Viewer.output("\nBubbleSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.bubbleSort(a)[i]);
        }
        Viewer.output("\nSelectionSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.selectionSort(a)[i]);
        }
        Viewer.output("\nInsertionSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.insertionSort(a)[i]);
        }
        Viewer.output("\nQuickSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.quickSort(a, 0, a.length - 1)[i]);
        }
        Viewer.output("\nBinarySearch Array A and Array B\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Searcher.binarySearch(a, b)[i]);
        }
        Viewer.output("\nLinearSearch\n");
        Viewer.output(Searcher.linearSearch(a, rand.nextInt(100)));
    }

}