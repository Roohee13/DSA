import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr ={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 10;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[]  search(int[][] matrix, int target){
      
        int row=0;
        int col=matrix.length-1;
        while(col>=0 && row< matrix.length){
            if (target==matrix[row][col]){
                return new int[] {row,col};
            }else if(target > matrix[row][col]){
               row++;
            }else{
                col--;
            }
        }
       
       return new int[] {-1,-1};
    }
}
