package Part1Recursion;

public class FibMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Recursive: " + RecursiveFib.fib(45));
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed + " ms");

        start = System.currentTimeMillis();
        System.out.println("Iterative: " + IterativeFib.fib(45));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println(timeElapsed + " ms");
    }
}
