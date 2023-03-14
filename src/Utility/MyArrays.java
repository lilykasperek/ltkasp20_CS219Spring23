package Utility;

import java.util.Arrays;

public class MyArrays {


    public static int indexOf(int [] values, int key) {

        for (int i = 0; i < values.length; i++)
            if (values[i] == key)
                return i;

        return -1;
    }

    // shift all of the values in the array
    // left by 1 place, filling in the
    // last value as zero
    public static int[] shift(int [] values, int i) {

        for (int j = i; j < values.length - 1; j++)
            values[j] = values[j+1];

        values[values.length -1] = 0;

        return values;
    }


    public static double max(double [] values) {
        double largest = values[0];
        // largest = Double.NEGATIVE_INFINITY;

        for (double v : values)
            if (v > largest)
                largest = v;
        return largest;
    }

    public static double min(double [] values) {
        double lowest = values[0];
        // lowest = Double.POSITIVE_INFINITY;

        for (double v : values)
            if (v < lowest)
                lowest = v;
        return lowest;

    }

    public static double median(double [] values) {

        double [] tmp = Arrays.copyOf(values, values.length);
        Arrays.sort(tmp);

        if (tmp.length % 2 == 1)
            return tmp[tmp.length / 2];
        else
            return (tmp[tmp.length / 2] +
                    tmp[tmp.length / 2 - 1]) / 2;
    }

    public static void printDoubles(double [] values) {
        System.out.print('[');
        for (int i = 0; i < values.length - 1; i++)
            System.out.print(values[i] + ", ");
        System.out.print(values[values.length - 1]);
        System.out.println(']');
    }

    public static double mean(double [] values) {
        double total = 0;
        for (double value : values) {
            total = total + value;
        }
        return total/values.length;
    }

    public static void main(String[] args) {
        // run some tests
        int [] array = {4, 7, 6, 9, 1, 7};
        System.out.println(indexOf(array, 9) == 3);
        System.out.println(indexOf(array, 43) == -1);
        System.out.println(indexOf(array, 7) == 1);

        shift(array, 2);
        System.out.println(Arrays.toString(array).
                equals(Arrays.toString(new int[]{4, 7, 9, 1, 7, 0})));

        System.out.println(Arrays.compare(array, new int[]{4, 7, 9, 1, 7, 0}) == 0);
    }
}
