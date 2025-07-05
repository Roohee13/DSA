import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' +'b'); // adds the ASCII values of a and b
        System.out.println("a"+"b"); // return concatenation of string --- ab
        System.out.println('a'+3);// returns the sum of 3 and ascii value of a which is 97
        System.out.println((char)('a'+3));// returns a+3 ==d

        System.out.println("a"+1);
        //this is same as after a few steps : "a" +"1"
        //integer will be conerted to integer that will call toString method
        System.out.println("Roohee" + new ArrayList<>());
        System.out.println("Roohee" + new Integer(56));

        System.out.println(new Integer(56)+" "+new ArrayList<>());
        // + operator can either with primitie datatypes or it can only be used for strings(at least one string should be there)
        
    }
}
