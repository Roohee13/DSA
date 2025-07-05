public class linearSearch {
    public static void main(String[] args) {
        int[] arr= {23,47,55,27,19,45,73};
        int target = 19;
        int ans= ls(arr, target);
        System.out.println(ans);
    }

    static int ls(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
