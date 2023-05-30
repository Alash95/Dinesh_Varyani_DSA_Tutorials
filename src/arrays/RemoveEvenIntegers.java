package arrays;

import java.util.Arrays;

public class RemoveEvenIntegers {

    public static int[] removeEvenIntegers(int[] arr) {
        /**
         * get an odd count
         * increment the odd count
         * assign the odd count to a result array
         * assign the index of result array to new array
         */

        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = {3, 2, 4, 7, 10, 6, 5};

        System.out.println(Arrays.toString(removeEvenIntegers(result)));
    }
}
