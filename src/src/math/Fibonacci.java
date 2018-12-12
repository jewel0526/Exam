package src.math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.z
         */


        int j, a = 0, b = 0, c=1;


        System.out.println("my fibonacci series are:");
        for (int i =1; i<=40; i++) {

            a =b;
            b=c;
            c=a+b;
            System.out.println(a+ " ");
        }

    }
}
