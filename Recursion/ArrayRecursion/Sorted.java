package ArrayRecursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr={2,4,17,9};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] arr,int i){
       if(i==arr.length-1){
           return true;
       }
       return (arr[i]<arr[i+1]) && sorted(arr,i+1);
    }
}
