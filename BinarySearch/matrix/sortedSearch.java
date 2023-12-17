package BinarySearch.matrix;

import java.util.Arrays;

public class sortedSearch {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int a[]=new int[arr.length*arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                a[(i*arr.length)+j]=arr[i][j];
            }
        }
        System.out.println(Search(a, 15));
    }
    static int Search(int arr[],int target){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>target) {
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return arr[mid];
            }
         }
        return -1;  
          
    }
}
