package Sorting;

import java.util.Arrays;

public class merge {
     static int[] merge(int arr[],int min,int mid,int max){
        int f=min,s=mid+1,t=min;
        int temp[]=new int[1000];
        while (f<=mid && s<=max) {
            if(arr[f]>arr[s]){
                temp[t]=arr[s];
                s++;
            }
            else{
                temp[t]=arr[f];
                f++;
            }
            t++;
        }
        while(f<=mid){
            temp[t]=arr[f];
            f++;
            t++;
        }
        while(s<=max){
            temp[t]=arr[s];
            s++;
            t++;
        }
        return temp;
         


     }
    static void mergeSort(int arr[],int min,int max){
        while (min<max) {
            int mid=min+(max-min)/2;
            mergeSort(arr, min, mid);
            mergeSort(arr,mid+1,max);
            merge(arr,min,mid,max);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
