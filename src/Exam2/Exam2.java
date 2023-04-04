package Exam2;

import java.util.Arrays;

public class Exam2 {


    public static int index_min(int[] array) {

        int index_min = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[index_min]>array[i]) {
                return i;
            }
        }
        return index_min;
    }

    public static int index_max(int[] array) {
        int index_max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index_max]<array[i]) {
                return i;
            }
        }
        return index_max;
    }

    public static void closest(int[] arr) {


        Arrays.sort(arr);

        int max = arr[index_max(arr)];
        int min = arr[index_min(arr)];
        int diff = max - min;

        System.out.println(diff);

        //int index_first = 0;
        //int index_second = 0;
        //for (int i = 0; i < arr.length; i++) {
            //for (int j = i + 1; j < arr.length; j++) {
                //int diff = arr[i] - arr[j];
                //int diff = arr[5] - arr[0];
                    //if (diff == 2)
        // if ({
                        //index_first = arr[i];
                        //index_second = arr[j];
                    //}
            //}
        //}
        //System.out.println(index_first);
        //System.out.println(index_second);
    }

    public static void main(String[] args) {
        int[] test = new int[]{4, 0, -99, 23, 15, 6};
        closest(test);
    }
}
