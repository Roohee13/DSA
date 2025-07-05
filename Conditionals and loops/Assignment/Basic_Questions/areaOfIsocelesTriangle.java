package Assignment;

import java.util.Scanner;

public class areaOfIsocelesTriangle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the equal sides of triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the non equal sides of triangle : ");
         int b = sc.nextInt();

         int area = a*a *b;
         System.out.println(area);
         sc.close();
    }
    
}
