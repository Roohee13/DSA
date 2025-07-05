import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] nums= {1,3,5,3,2,4};
        int answer = findDuplicate(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(answer);
        
    }

    public static int findDuplicate(int[] nums) {
        
        int i=0;
        while(i<nums.length){
            
                int correct= nums[i] -1;
                if(nums[i] != nums[correct]){
                     int temp= nums[i];
                     nums[i] = nums[correct];
                     nums[correct] =temp;
                }
            else{
                i++;
            }
        }
        for(int index=0;index <nums.length;index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
        
    }

    public  static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct= nums[i] -1;
                if(nums[i] != nums[correct]){
                     int temp= nums[i];
                     nums[i] = nums[correct];
                     nums[correct] =temp;
                }else{
                    ans.add(nums[i]);
                }}
            else{
                i++;
            }
        }
        return ans;
    }
}
