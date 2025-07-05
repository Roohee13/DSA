package Assignment;

import java.util.Scanner;

public class Basic22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        int sum=0;
        int product=1;
        int rem=0;

        while(num>0){
            rem= num%10;
            sum+=rem;
            product*=rem;
            num= num/10;

        }
        System.out.println(product-sum);
        sc.close();
    }
}
