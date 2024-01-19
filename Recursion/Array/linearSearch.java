package Recursion.Array;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={3,2,1,18,9};
        System.out.println(search(arr,28,0));
    }
    static boolean search(int arr[],int target,int index){
        if(index==arr.length-1){
            return false;
        }
         return arr[index]==target || search(arr, target, index+1);
    }
}
