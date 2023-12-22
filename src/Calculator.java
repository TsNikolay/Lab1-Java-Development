public class Calculator {

    public static void main(String[] args) {
        try {
            double result = sum(7, 10, 1, 1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double sum(int n, int m, int a, int b) {
        if (n <= a || m <= b) {
            throw new IllegalArgumentException("Invalid range: n should be greater than a, and m should be greater than b.");
        }

        if ((a <= 0 && n >= 0) || (b <= 0 && m >= 0)) {
            throw new IllegalArgumentException("It's impossible to divide by zero. Check values: a=" + a + ", b=" + b + ", n=" + n + ", m=" + m);
        }

        double result2 = 0;
        for (int i = a; i <= n; i++) {
            double result1 = 0;
            for (int j = b; j <= m; j++) {
                if (i != 0 && j != 0) {
                    result1 += ((double) (i % j)) / i;
                }
            }
            result2 += result1;
        }
        return result2;
    }
}
