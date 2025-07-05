public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,8,9,98};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){
        
        int mid= start + (end - start)/2;

        if(start>end){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }else if (arr[mid] >target) {
            return search(arr, target, start, mid-1);
            
        }else{
            return search(arr, target, mid+1, end);
        }
        
    }
}
