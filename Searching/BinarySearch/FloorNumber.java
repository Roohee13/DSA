public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,56,65,67,71,72,89};
        int target = 68;
        int ans= floorNum(arr,target);
        System.out.println(ans);
    }

    public static int floorNum(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<= end){
            int mid= start + (end-start)/2;
            if(target< arr[mid]){
               end= mid-1;
            }else if(target>arr[mid]){
               start = mid+1;
            }else{
               return mid;
            }
        }
        return end;
    }
}
