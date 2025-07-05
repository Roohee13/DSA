import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {1,3,5,2,6,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int max= maxElementInArray(arr, last);
            swap(arr, max,last);
        }
    }

    static int maxElementInArray(int[] arr,int last){
        int max=0;
        for(int i=0;i<=last;i++){
           if(arr[i]>arr[max]){
              max=i;
           }
        }
        return max;
    }

    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}
