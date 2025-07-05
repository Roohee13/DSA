import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
      int[] arr={1,4,2,5,3};
      System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        Boolean swapped= false;
        int count=0;
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                swapped= true;
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
             count++;
           }
           if(!swapped){
            break;
           }
        }
        System.out.println(count);
        return arr;
    }
}