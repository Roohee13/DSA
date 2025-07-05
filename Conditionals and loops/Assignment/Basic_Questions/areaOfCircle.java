package Assignment;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double r= sc.nextFloat();
        double pi = 3.14;
        double area = pi* Math.pow(r, 2.0);
        System.out.println("Area of circle is "+area);
        sc.close();
    }
}
