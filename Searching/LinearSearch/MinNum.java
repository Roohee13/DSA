public class MinNum {
    public static void main(String[] args) {
        int[] arr= {23,47,55,27,19,45,73};
        System.out.println(minimum(arr));
    }

    static int minimum(int arr[]){
        if(arr.length==0){
            return -1;
        }
        
        int min= arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min= arr[i];
            }
        }

        return min;
    }
    
}
