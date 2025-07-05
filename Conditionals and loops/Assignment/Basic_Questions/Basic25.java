package Assignment;

import java.util.Scanner;

public class Basic25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int largest=num;
        while (num>0) {
            if(num>largest){
                largest=num;
            }
            num=sc.nextInt();
        }
        System.out.println(largest);
        sc.close();
    }
}
