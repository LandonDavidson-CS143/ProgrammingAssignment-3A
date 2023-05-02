/*
Name: Landon Davidson
Section: 32768
Program Name: LambdaMain

Description: Creates various ArrayProcessor lambda expressions using
the ArrayProcessor functional interface
 */

package Part2Lambda;

import java.util.Arrays;

public class LambdaMain {
    public static void main(String[] args) {
        double[] firstList = { 6, 2.6, 3, 5, 7, 12, 7, 2.5, 10.3, 1.7 };
        ArrayProcessor numberOfElements = (array) -> { return array.length;};
        ArrayProcessor maxVal = (array) -> {
            double max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        };

        ArrayProcessor minVal = (array) -> {
            double min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        };

        ArrayProcessor sumOfElements = (array) -> {
            double sum = 0;
            for (double v : array) {
                sum += v;
            }
            return sum;
        };

        ArrayProcessor averageOfElements = (array) -> {
            double total = sumOfElements.apply(array);
            return total / array.length;
        };

        System.out.println("List: " + Arrays.toString(firstList));
        System.out.println("Amount of Elements: " + numberOfElements.apply(firstList));
        System.out.println("Maximum Value: " + maxVal.apply(firstList));
        System.out.println("Minimum Value: " + minVal.apply(firstList));
        System.out.println("Sum of Elements: " + sumOfElements.apply(firstList));
        System.out.println("Average of Elements: " + averageOfElements.apply(firstList));
    }
}
