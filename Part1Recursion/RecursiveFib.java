/*
Name: Landon Davidson
Section: 32768
Program Name: RecursiveFib

Description: Finds the nth number in the Fibonacci sequence recursively
 */

package Part1Recursion;

public class RecursiveFib {
    public static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
