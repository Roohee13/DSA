 package Assignment;

import java.util.Scanner;

public class areaOfTriangle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Base of triangle : ");
        double b= sc.nextFloat();
        
        System.out.print("Enter the Height of triangle : ");
        double h= sc.nextFloat();

        double area= 0.5 * b * h;
        System.out.println(area);
        sc.close();

    }
    
}