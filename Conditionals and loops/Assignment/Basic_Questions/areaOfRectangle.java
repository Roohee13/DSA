package Assignment;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the bredth of the rectangle : ");
        int b= sc.nextInt();

        int area= l*b;
        System.out.println(area);
        sc.close();
    }
}
