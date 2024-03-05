public class PowerOfNum {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return (1 / x) * power(x, n + 1);
        }
    }

    public static void main(String[] args) {
        double x = 4;
        int n = 5;

        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}

