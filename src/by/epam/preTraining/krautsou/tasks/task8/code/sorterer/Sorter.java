package by.epam.preTraining.krautsou.tasks.task8.code.sorterer;

import java.util.Arrays;

public class Sorter {
    public static int[] countSort(int[] array) {
        int min, max = min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] counter = new int[max - min + 1];
        for (int anArray : array) {
            counter[anArray - min]++;
        }

        int idCounter = 0;
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i]; j++) {
                array[idCounter] = i + min;
                idCounter++;
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int c = array[min];
            array[min] = array[i];
            array[i] = c;
        }
        return array;
    }

    public static int[] selectionSortWithRecursion(int[] array, int n) {
        if (n == array.length - 1) {
            return array;
        }
        int temp, lowestIndex = n;
        for (int i = n + 1; i < array.length; i++) {
            if (array[i] < array[lowestIndex]) {
                lowestIndex = i;
            }
        }
        temp = array[n];
        array[n] = array[lowestIndex];
        array[lowestIndex] = temp;
        return selectionSortWithRecursion(array, n+1);
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortWithRecursion(int[] array, int n) {
        if (n == 1)
            return null;
        for (int i = 0; i < n - 1; i++)
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        bubbleSortWithRecursion(array, n - 1);
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            int pos = i;
            while (pos > 0 && array[pos - 1] > n) {
                array[pos] = array[--pos];
            }
            array[pos] = n;
        }
        return array;
    }

    public static int[] insertionSortRecursive(int[] array, int n) {
        if (n <= 1)
            return null;
        insertionSortRecursive(array, n - 1);
        int last = array[n - 1];
        int j = n - 2;
        while (j >= 0 && array[j] > last) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = last;
        return array;
    }

    public static int[] quickSortWithRecursion(int[] array, int start, int end) {
        if (start >= end)
            return null;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quickSortWithRecursion(array, start, cur);
        quickSortWithRecursion(array, cur + 1, end);
        return array;
    }

    public static int[] mergeSort(int[] array) {
        int len = array.length;
        int n = 1;
        int shift;
        int twoSize;
        int[] array2;
        while (n < len) {
            shift = 0;
            while (shift < len) {
                if (shift + n >= len) break;
                twoSize = (shift + n * 2 > len) ? (len - (shift + n)) : n;
                array2 = merge(Arrays.copyOfRange(array, shift, shift + n),
                        Arrays.copyOfRange(array, shift + n, shift + n + twoSize));
                for (int i = 0; i < n + twoSize; ++i)
                    array[shift + i] = array2[i];
                shift += n * 2;
            }
            n *= 2;
        }
        return array;
    }

    public static int[] mergeSortWithRecursion(int[] array) {
        int len = array.length;
        if (len < 2) return array;
        int middle = len / 2;
        return merge(mergeSortWithRecursion(Arrays.copyOfRange(array, 0, middle)),
                mergeSortWithRecursion(Arrays.copyOfRange(array, middle, len)));
    }

    private static int[] merge(int[] start, int[] end) {
        int[] result = new int[start.length + end.length];
        int startIndex = 0;
        int endIndex = 0;
        int resultIndex = 0;

        while (startIndex < start.length || endIndex < end.length) {
            if (startIndex < start.length && endIndex < end.length) {
                if (start[startIndex] < end[endIndex]) {
                    result[resultIndex] = start[startIndex];
                    startIndex++;
                    resultIndex++;
                } else {
                    result[resultIndex] = end[endIndex];
                    endIndex++;
                    resultIndex++;
                }
            } else if (startIndex < start.length) {
                for (int i = resultIndex; i < result.length; i++) {
                    result[i] = start[startIndex];
                    startIndex++;
                }
            } else if (endIndex < end.length) {
                for (int i = resultIndex; i < result.length; i++) {
                    result[i] = end[endIndex];
                    endIndex++;
                }
            }
        }
        return result;
    }
}
