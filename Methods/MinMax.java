import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
         maxNum(x,y,z);
         minNum(x, y, z);

       
       sc.close();
    }

    public static void maxNum(int a, int b, int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
         System.out.println("The maximum  numbers is "+max);
    }

    public static void minNum(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
         System.out.println("The minimum  numbers is "+min);
    }
}