public class longestMountainArray {
    public int longestMountain(int[] arr) {
        int max=0;
        for(int i=1;i<arr.length-1;i++){
          if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
              max=Math.max(max,helper(arr,i));
          }
        }
        return max;
    }
    static int helper(int arr[],int index){
        int ans=0;
        int i=index-1;
        int a=arr[index];
        while(i>=0 && arr[i]<a){
            ans++;
            a=arr[i];
            i--;
        }
         i=index+1;
        a=arr[index];

        while(i<arr.length && arr[i]<a){
            ans++;
            a=arr[i];
            i++;
        }

        return ans+1;
    }
}
/*
 * You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.

 

Example 1:

Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
Example 2:

Input: arr = [2,2,2]
Output: 0
Explanation: There is no mountain.
 
 */
