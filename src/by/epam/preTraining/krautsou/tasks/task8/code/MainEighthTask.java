package by.epam.preTraining.krautsou.tasks.task8.code;

import by.epam.preTraining.krautsou.tasks.task8.code.search.Searcher;
import by.epam.preTraining.krautsou.tasks.task8.code.sorterer.Sorter;
import by.epam.preTraining.krautsou.tasks.task8.code.viewer.Viewer;

import java.util.Arrays;
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
        int [] temp = Arrays.copyOf(a, a.length);
        Viewer.output("Array A\n");
        for (int anA : a) {
            Viewer.output(anA);
        }
        Viewer.output("\nArray B\n");
        for (int aB : b) {
            Viewer.output(aB);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nQuickSortWithRecursion\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.quickSortWithRecursion(a, 0, a.length - 1)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nMergeSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.mergeSort(a)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nMergeSortWithRecursion\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.mergeSortWithRecursion(a)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nCountSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.countSort(a)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nBubbleSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.bubbleSort(a)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nBubbleSortWithRecursion\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.bubbleSortWithRecursion(a, a.length)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nSelectionSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.selectionSort(a)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nSelectionSortWithRecursion\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.selectionSortWithRecursion(a, 0)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nInsertionSort\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.insertionSort(a)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nInsertionSortWithRecursion\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output(Sorter.insertionSortRecursive(a, a.length)[i]);
        }
        a = Arrays.copyOf(temp, temp.length);
        Viewer.output("\nBinarySearch Array A and Array B\n");
        for (int i = 0; i < a.length; i++) {
            Viewer.output( Searcher.binarySearch(Sorter.mergeSort(a), b)[i]);
        }
        Viewer.output("\nLinearSearch\n");
        Viewer.output(Searcher.linearSearch(a, rand.nextInt(100)));
    }
}