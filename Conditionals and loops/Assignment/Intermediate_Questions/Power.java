import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        System.out.print("Enter the power of the number : ");
        int p= sc.nextInt();

        int power=1;
        while(p>0){
            power=power*num;
            p--;
        }

        System.out.println(power);
        sc.close();
    }
}
