public class Calculator {

    public double sum(int n, int m, int a, int b) {
        if (n <= a || m <= b) {
            throw new IllegalArgumentException("Invalid range: n should be greater than a, and m should be greater than b.");
        }

        double result2 = 0;
        for (int i = a; i <= n; i++) {
            double result1 = 0;
            for (int j = b; j <= m; j++) {
                if (j == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                result1 += ((double) (i % j)) / (i + 374);
            }
            result2 += result1;
        }
        return result2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.sum(7, 10, 1, 1);
        System.out.println("Result: " + result);
    }
}
