import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        double armNum=0;
        int temp = num;
        while(temp>0){
           int rem= temp%10;
           armNum= armNum+ Math.pow(rem, 3);
           temp= temp/10;
        } 

        if(num==armNum){
            System.out.println("It is an Armstrong number.");
        }else{
            System.out.println("It us not an Armstrong number.");
        }
        sc.close();
            
        

    }
}
