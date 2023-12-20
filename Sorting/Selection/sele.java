package Sorting.Selection;

import java.util.Arrays;

public class sele {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
       for (int i = 0; i < arr.length-1; i++) {
          for (int j = i+1; j < arr.length; j++) {
              if (arr[j]<arr[i]) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
              }
          }
       }
    }
}
