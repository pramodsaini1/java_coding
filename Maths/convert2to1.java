package Maths;

import java.util.Arrays;

public class convert2to1 {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4},{5,6}};
        int nums[]=new int[arr.length*arr[0].length];
         System.out.println("2-D Matrix is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Convert in the 1-D Array:");
        int k=0;
        for(int m=0;m<arr.length;m++){
            for(int n=0;n<arr[m].length;n++){
               nums[k]=arr[m][n];
               k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
         
    }
}
