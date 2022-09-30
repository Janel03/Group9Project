public class Task11 {
    public static void main(String[] args) {
        //task 11.Write a program to print out duplicate elements from
        //an Array of Strings?

        String[]arrays= {"World","Logitech","MacBook","World","World","MacBook","Server","Group","Logitech"};

        for(int i=0;i<arrays.length;i++) {
            for(int j=i+2;j<arrays.length;j++) {

                if(arrays[i].equals(arrays[j])) {
                    System.out.println(arrays[i]);
                }
            }
        }

    }

}

