public class EvenFibSum {

    static int evenFibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 2;
        }
        return evenFibonacciSum(n, 1, 2, 2);
    }

    static int evenFibonacciSum(int n, int num1, int num2, int sumOfEven) {
        int fib = num1 + num2;

        if (fib > n) {
            return sumOfEven;
        }

        if (fib % 2 == 0) {
            sumOfEven += fib;
        }

        return evenFibonacciSum(n, num2, fib, sumOfEven);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Sum of even Fibonacci numbers less than or equal to " + n + ": " + evenFibonacciSum(n));
    }
}
