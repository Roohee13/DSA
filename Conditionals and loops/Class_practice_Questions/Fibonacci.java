import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number whose fibonacci series you want to find.");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        

        for(int i=3;i<=n;i++){
           c= a+b;
           a=b;
           b=c;
        }

        System.out.println(c);
       sc.close();
    }
}
