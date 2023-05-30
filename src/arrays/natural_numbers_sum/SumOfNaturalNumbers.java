package arrays.natural_numbers_sum;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        System.out.println(sumOfNNumbers(99999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + "millisecs.");

    }

//    public static int sumOfNNumbers(int n) {
//        return n * (n + 1) /2;
//    }

    public static int sumOfNNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
