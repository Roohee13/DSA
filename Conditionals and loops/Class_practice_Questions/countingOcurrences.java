import java.util.Scanner;

public class countingOcurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.print("Enter which number occurence you want to check:");

        int n = sc.nextInt();
        int rem=0;
        int count =0;
        int temp = num;
        while(temp>0){
           rem= temp%10;
           if(rem==n){
            count++;
           }
           temp= temp/10;
        }
    System.out.println(count);
    sc.close();
    }
}
