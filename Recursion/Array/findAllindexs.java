package Recursion.Array;

import java.util.ArrayList;

public class findAllindexs {
    static ArrayList<Integer> ans=new ArrayList<>();
    public static void search(int arr[],int target,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        search(arr, target, index+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        search(arr,4,0);
        System.out.println(ans );
    }
}
