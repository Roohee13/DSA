import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose reverse you want to find: ");
        int num= sc.nextInt();
        int finNum= 0;
        int rem=0;
        while(num>0){
            rem= num%10;
            finNum= finNum*10 + rem;
            num/= 10;

        }
        System.out.println(finNum);
        sc.close();
    }
}
