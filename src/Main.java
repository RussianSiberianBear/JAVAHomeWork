import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//1

        int[] inputArray = {50000, 45000, 60000, 75000, 40000};
        int sumAll = 0;
        int maxSum = 0;
        int minSum = 0;
        float avgSum = 0;

        for (int elem : inputArray) {
            sumAll += elem;
            if (maxSum < elem) {
                maxSum = elem;
            }
        }

        minSum = maxSum;
        for (int element : inputArray) {
            if (element < minSum) {
                minSum = element;
            }
        }
        avgSum = (float) (sumAll / inputArray.length);

        System.out.println(Arrays.toString(inputArray));
        float[] outputArray = {sumAll, maxSum, minSum, avgSum};
        System.out.println(Arrays.toString(outputArray));

//2

        int[] inputArray2 = {50000, 45000, 60000, 75000, 40000};
        float[] outputArray2 = new float[inputArray2.length];

        int j = 0;
        for (int elem : inputArray2) {
            outputArray2[j] = elem * 0.13F;
            j++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

//3
        int[] inputArray3 = {6000, 4500, 7000, 5000, 10000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int idx = 0;
        for (int bonus : inputArray3) {
            outputArray3[idx] = bonus > 5000;
            idx++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

//4

        // Я понял условия задачи так, что outputArray4 просто флаг с типом boolean
        // в качестве массива это вроде и не надо несмотря на имя
        int[] inputArray4 = {6000, -4500, 7000, -5000, 10000};
        boolean outputArray4 = true;

        for (int balance : inputArray4) {
            outputArray4 = (outputArray4 && (balance > 0));
            if (!outputArray4) break;
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);

//5/
        int[] inputArray5 = {10000, -2000, 5000, -4000, 20000};
        int outputArray5 = 0;

        for (int balance : inputArray5) {
            if (balance > 0) outputArray5++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(outputArray5);
    }


}
