public class Task5 {
    public static void main(String[] args) {
        //TASK 5
        int sum=0;
        int sum2=0;

        int[][] num= {{8,12,7,5},
                {3,10,23,23},
                {17,14,4,20}
        };


        for(int[] number:num) {

            for(int n:number) {
                if(n%2==0) {
                    sum+=n;

                }else {
                    sum2+=n;
                }}
        }System.out.print("The Sum of all odd numbers are "+sum2+" and the sum of all even numbers are "+sum);
    }}


