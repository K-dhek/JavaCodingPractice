public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is my second commit: Updated git ignore");
        printNumbers(10);
    }

    //print up to n numbers
    public static void printNumbers(int n){

        if(n>=0){
            for (int i = 0; i < n; i++) {
                System.out.println(i);

            }
        }
    }

}