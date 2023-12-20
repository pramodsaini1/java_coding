package Sorting.Insertion;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
          int arr[]={5,3,4,1,2};
          insertion(arr);
          System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
         for (int i = 0; i < arr.length-1; i++) {
             for (int j=i+1; j >=1; j--) {
                if (arr[j-1]>arr[j]) {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
             }
         }
    }
}
