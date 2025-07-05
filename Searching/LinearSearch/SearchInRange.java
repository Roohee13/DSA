public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {23,47,55,27,19,45,73};
        int target = 19;
        int start=1;
        int end= 4;
        boolean ans= search(arr, target,start, end);
        System.out.println(ans);
    }

    static boolean search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return false;
        }

        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
