package Recursion.Array;

public class learsear {
    public static int search(int arr[],int target,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return arr[index];
        }
        return  search(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,46,7};
        System.out.println(search(arr,46,0));
    }

}
