package arrays.array_update_and_adding_elements;

public class ArrayUtil {

    public static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayDemo() {
        int[] myArray = new int[5];
//        printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = {5,1,8,10};
        printArray(arr);
    }

    public static void main(String[] args) {
        arrayDemo();
    }
}

