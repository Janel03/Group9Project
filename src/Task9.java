import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //9. Maximum and minimum number in the array?

        Scanner scan = new Scanner (System.in);

        int [] numbers= new int[10];

        int min=0;
        int max=0;


        for(int i=0;i<numbers.length;i++) {
            numbers[i]=scan.nextInt();

            if(numbers[i]<=0) {
                min=numbers[i];

            }else{
                if(numbers[i]<=1) {
                    min=numbers[i];
                }
            }

            max=Math.max(max, numbers[i]);

        }
        System.out.println(max+ " "+min);
    }
}


