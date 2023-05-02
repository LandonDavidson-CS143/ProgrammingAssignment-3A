package Part2Lambda;

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

        System.out.println(averageOfElements.apply(firstList));
    }
}
