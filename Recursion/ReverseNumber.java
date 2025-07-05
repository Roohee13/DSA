import static java.lang.Math.pow;

public class ReverseNumber {
    public static void main(String[] args) {
        revNum(432);
        System.out.println(sum);
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
}
