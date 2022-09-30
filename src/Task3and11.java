public class Task3and11 {
    public static void main(String[] args) {
        //Task 3. Create a 2D array of integer values. Print the sum of all numbers.
        int[][] a = { {8,16,3},
                {22,1,32},
                {6,1,2}};
        int sum=0;
        for (int[] num:a) {
            for (int n:num) {
                sum+=n;
            }}
        System.out.println("Total sum of all elements: "+sum);

        //task 11.Write a program to print out duplicate elements from
        //an Array of Strings?
        String[]arrays= {"World","Logitech","MacBook","World","World","MacBook","Server","Group","Logitech"};

        for(int i=0;i<arrays.length;i++) {
            for(int j=i+2;j<arrays.length;j++) {

                if(arrays[i].equals(arrays[j])) {
                    System.out.println(arrays[i]);
                }}}}}



