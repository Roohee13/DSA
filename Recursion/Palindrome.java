public class Palindrome {
    public static void main(String[] args) {

        System.out.println(pal(232));
    }
    static int sum=0;
    public static void revNum(int n){
        if(n==0){
            return;
        }
        int rem= n%10;
        sum= sum *10 + rem;
        revNum(n/10);
    }
    public  static boolean pal(int n){
        revNum(n);
        return (sum == n);
    }
}
