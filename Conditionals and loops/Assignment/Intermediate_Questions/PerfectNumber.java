import java.util.Scanner;
import java.util.InputMismatchException;

class WrongInputException extends Exception{
    public WrongInputException(String messege){
        super(messege);
    }
}

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter a number : ");
             int num= sc.nextInt();

        if(num<=0){
            throw new WrongInputException("Please enter an positive integer.");
        }

        int perNum=0;
        for(int i=1;i<=num/2;i++){
          if(num%i==0){
            perNum=perNum+i;
          } 
        }

        if(perNum==num){
            System.out.println(num + " is a perfect number.");}
            else{
            System.out.println(num + " is not a perfect number.");
        }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input : Please enter an integer.");
        }catch(WrongInputException e){
            System.out.println("Custom Exception : "+e.getMessage());
        }finally{
            sc.close();
        }
        

        
        
    }
}
