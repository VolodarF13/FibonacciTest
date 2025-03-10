import java.util.HashMap;
import java.util.Map;

class FibonacciDynamic {
    private static Map<Integer, Long> numbers = new HashMap<>();

    public static long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }
        if (numbers.containsKey(n)) {
            return numbers.get(n);
        }
        long fib = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);
        numbers.put(n, fib);
        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        long result = FibonacciDynamic.fibonacciDynamic(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}



