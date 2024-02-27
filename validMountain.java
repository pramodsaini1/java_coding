public class validMountain {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        int peakIndex=findPeakIndex(arr);
        if(peakIndex==0 ||peakIndex==arr.length-1){
            return false;
        }
        for(int i=0;i<peakIndex;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=peakIndex;i<arr.length-1;i++){
            if(arr[i+1]>=arr[i]){
                return false;
            }
        }
        return true;
   }
   private int findPeakIndex(int []arr){
       int peak=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>arr[peak]){
               peak=i;
           }
       }
       return peak;
   }
}
/*
 * Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 

Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 
 */
