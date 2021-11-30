package main;

import java.util.Arrays;

public class ChopMainClass {
    public static int chop(int element, int[] array) {
        if (isEmpty(array))
            return -1;

        var begin = 0;
        var last = array.length - 1;
        var mid = 0;

        while (begin <= last) {
            mid = (begin + last) / 2;
            if (array[mid] > element) {
                last = mid - 1;
            } else if (array[mid] < element) {
                begin = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
//        return binarySearch(array.length / 2, element, array);
    }

    private static int binarySearch(int position, int element, int[] array) {
        if (isEmpty(array))
            return -1;
        var len = array.length;
        if (element < array[position]) {
            int[] lowerHalf = Arrays.copyOfRange(array, 0, len / 2);
            binarySearch(lowerHalf.length / 2, element, lowerHalf);
        } else if (element > array[position]) {
            int[] upperHalf = Arrays.copyOfRange(array, (len / 2), len);
            binarySearch(upperHalf.length / 2, element, upperHalf);
        }
        return position;
    }

    private static boolean isEmpty(int[] array) {
        return 0 == array.length;
    }
}
