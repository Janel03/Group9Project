public class Task7 {
    public static void main(String[] args) {
        // Task 7
        int number = 252;

        boolean group9 = false;
        for (int k = 2; k <= number / 2; k++) {
            if (number % k == 0) {
                group9 = true;
                break;
            }
        }
        if (!group9)
            System.out.println( "This is a prime number: "+number);
        else
            System.out.println(" This is not a prime number:  "+ number);

    }

}

