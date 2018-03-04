package by.epam.preTraining.krautsou.tasks.task8.code.search;

public class Searcher {
    public static int[] binarySearch(int[] array, int[] secondArray) { // -1 нет такого значения
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int l = 0;
            int r = array.length - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (array[m] == secondArray[m]) {
                    result[i] = m + 1;
                    break;
                } else if (array[m] == secondArray[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
                result[i] = -1;
            }
        }
        return result;
    }

    public static String linearSearch(int[] array, int value) {
        String result = "Not found";
        for (int x : array) {
            if (x == value) {
                result = ("Found");
                break;
            }
        }
        return result;
    }
}
