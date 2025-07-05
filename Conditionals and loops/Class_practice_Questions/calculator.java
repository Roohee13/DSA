import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operation you want to perform among '+' ,'-', '*', '/' :  ");
        char op= sc.next().trim().charAt(0);

        int ans=0;

        if(op == '+'){
           ans = num1+ num2;
        }
        else if(op == '-'){
           ans = num1- num2;
        }
        else if(op == '*'){
          ans = num1 * num2;
        }
        else if(op == '/'){
           ans = num1/ num2;
        }else{
            System.out.println("Invalid operation");
        }
        
        System.out.println(ans);
        sc.close();
    }
}
