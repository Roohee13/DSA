package Assignment;

import java.util.Scanner;

public class Basic24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            sum=sum+num;
            num=sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}
