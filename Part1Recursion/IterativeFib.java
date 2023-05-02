package Part1Recursion;

public class IterativeFib {
    public static int fib(int n) {
        int count = 3;
        int n2 = 0;
        int n1 = 1;
        int temp;
        while (count < n) {
            temp = n1;
            n1 = n1 + n2;
            n2 = temp;
            count++;
        }
        return n2 + n1;
    }
}
