import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidInputException extends Exception{
     public InvalidInputException(String messege){
        super(messege);
     }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            
        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        
        if(num<=0 ){
           throw new InvalidInputException(" Please input a positive integer.");
        }

        int temp=num;
        int palNum=0;
        while (temp>0) {
            int rem=temp%10;
            palNum= palNum*10 + rem;
            temp/=10;
        }

        if(palNum== num){
            System.out.println("The number is an palindrome number.");
        }else{
            System.out.println("The number is not an palindrome number.");
        }

        }catch (InputMismatchException e) {
            System.out.println("Invalid input : please enter an integer.");
        }catch(InvalidInputException e){
            System.out.println("Custom Exception"+e.getMessage());
        }finally{
            sc.close();
        }
        
        
    }
}
