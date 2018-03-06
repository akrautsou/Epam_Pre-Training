package by.epam.preTraining.krautsou.tasks.task8.code.search;

public class Searcher {
    //O(N*N)
    public static int[] binarySearch(int[] array, int[] arrayB) { // -1 нет такого значения
        int[] result=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int index=-1;
            int low=0;
            int high=result.length-1;
            int mid=high;
            while(true){
                if(array[mid]==arrayB[i]){
                    index=mid;
                    break;
                }else if(low==high){
                    break;
                }
                mid=(high+low)/2;
                if(arrayB[i]<array[mid]){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }
            if(index>-1){
                index++;
            }
            result[i]=index;

        }
        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return result;
    }
    //O(N)
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
