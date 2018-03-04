package by.epam.preTraining.krautsou.tasks.task8.code.sorterer;

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

    public static int[] quickSort(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        int left = low;
        int right = high;
        int pivot = array[mid];
        while (left <= right) {
            while (array[left] < pivot)
                left++;
            while (array[right] > pivot)
                right--;
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return array;
    }

    public static int[] mergeSort(int[] input) {

        if (input.length == 1) {
            return input;
        }

        int middle = (int) Math.ceil((double) input.length / 2);
        int[] left = new int[middle];

        int rightLength;
        if (input.length % 2 == 0) {
            rightLength = middle;
        } else {
            rightLength = middle - 1;
        }
        int[] right = new int[rightLength];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < input.length; i++) {
            if (i < middle) {
                left[leftIndex] = input[i];
                leftIndex++;
            } else {
                right[rightIndex] = input[i];
                rightIndex++;
            }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    result[resultIndex] = left[leftIndex];
                    leftIndex++;
                    resultIndex++;
                } else {
                    result[resultIndex] = right[rightIndex];
                    rightIndex++;
                    resultIndex++;
                }
            } else if (leftIndex < left.length) {
                for (int i = resultIndex; i < result.length; i++) {
                    result[i] = left[leftIndex];
                    leftIndex++;
                }
            } else if (rightIndex < right.length) {
                for (int i = resultIndex; i < result.length; i++) {
                    result[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }
        return result;
    }
}
