import java.util.ArrayList;
import java.util.List;

public class kthclose {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList ls = new ArrayList<>();
         int l=0,r=arr.length-1;
         while(r-l>=k){
             if(Math.abs(arr[l]-x)>Math.abs(arr[r]-x)){
                 l++;
             }
             else{
                 r--;
             }
         }
         for(int i=l;i<=r;i++){
             ls.add(arr[i]);
         }
             
       
        return ls;
    }
}
/*
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 

Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:

Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
 * 
 * 
 */
