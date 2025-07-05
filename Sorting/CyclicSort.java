import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {1,3,5,2,6,4};
        int[] nums= {9,6,4,2,3,5,7,0,1};
        cyclic(arr);
        sort(nums);
        System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(nums));
         System.out.println(missing(nums));
    }

    static void cyclic(int[] arr){
        for(int i=0;i<arr.length;i++){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }

    static void sort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp= nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            } else {
                i++;
            }
    }
}

    static int missing(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                 return i;
            }             
        }
        return nums.length;
    }
}
