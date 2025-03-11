class fibonacciRecurse {
    public static long fibonacci(long n){
        if(n <= 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("fibonacciIter.fibonacci() = " + fibonacciRecurse.fibonacci(10));
    }
}
