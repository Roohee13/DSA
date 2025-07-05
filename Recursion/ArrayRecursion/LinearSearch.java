package ArrayRecursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,8,5,2,6,18};
        int target= 2;
        System.out.println(linear(arr,target,0));
        linearSearchOnMultipleOccurence(arr, target, 0);
        System.out.println(list);
        ArrayList<Integer> list1= new ArrayList<>();
        System.out.println(findAllIndex(arr,target,0,list1));
        System.out.println(findAllIndex2(arr,target,0));
    }

    static int linear(int[] arr, int target, int index){
        //base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }

        return linear(arr,target,index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static int linearSearchOnMultipleOccurence(int[] arr, int target, int index){
        if(index == arr.length){
            return target;
        }
        if(arr[index]== target){
            list.add(index);
        }

        return linearSearchOnMultipleOccurence(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list1){
        if(index == arr.length){
            return list1;
        }
        if(arr[index]== target){
            list1.add(index);
        }

        return findAllIndex(arr,target,index+1,list1);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }

        ArrayList<Integer> allAnswers= findAllIndex2(arr,target,index+1);
        list.addAll(allAnswers);
        return list;
    }


}
