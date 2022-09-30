import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Task 1
        int elements=0;
        int sumOfelements = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of elements you want in array:");
        elements= scanner.nextInt();
        int k[] = new int[elements];
        System.out.println("Enter all the elements:");
        for(int b = 0; b < elements; b++) {
            k[b] = scanner.nextInt();
            sumOfelements = sumOfelements + k[b];
        }
        System.out.println("The sum of all stored elements in that array:"+sumOfelements);

    }

}


