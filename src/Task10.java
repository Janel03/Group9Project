public class Task10 {
    public static void main(String[] args) {
        //TASK 10
        int[] num= {12,18,54,38,29,41,89};

        int lar=num[0];
        int SecLar=num[0];

        for(int i=1;i<num.length;i++) {
            if(lar<num[i]) {
                lar=num[i];
            }}
        for(int a=1;a<num.length;a++) {
            if(SecLar<num[a]&&num[a]!=lar) {
                SecLar=num[a];
            }}
        System.out.println("The second largest number is "+SecLar);
    }

}

