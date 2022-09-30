public class Task8 {
    public static void main(String[] args) {
        // TASK 8
        int totalNumbers = 10;

        int[] fib = new int[totalNumbers];


        fib[0] = 0;
        fib[1] = 1;


        for(int i=2; i < totalNumbers; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println("Fibonacci Series to " + totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            System.out.print(fib[i] + " ");
        }
    }

}


