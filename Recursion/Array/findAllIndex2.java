package Recursion.Array;
import java.util.*;
public class findAllIndex2 {
    public static ArrayList<Integer> findAllIndex(int arr[],int target,int index,ArrayList<Integer> list){
         if(index==arr.length){
            return list;
         }
         if(arr[index]==target){
            list.add(index);
         }
         return findAllIndex(arr, target, index+1, list);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
    }
}
