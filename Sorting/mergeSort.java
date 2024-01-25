package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int s, int e) {
        if(e-s==1){
            return ;
        }
        int m=(s+e)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m, e);
        merge(arr,s,m,e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int mix[]=new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
    
}
