public class sortFrequecncy {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
       int b[]=new int[n];
       for(int i=0;i<n;i++){
          int c=0;
          for(int j=0;j<n;j++){
              if(nums[i]==nums[j]){
                  c++;
              }
          }
          b[i]=c;
      }
       for (int i=0; i<n; ++i){
           for (int j=i+1;j< n; ++j){
               if (b[i]>b[j]){
                  int t=b[j];
                  b[j]=b[i];
                  b[i]=t;

                 int t1=nums[j];
                  nums[j]=nums[i];
                  nums[i]=t1;
               }
               else if(b[i] == b[j]){
                   if(nums[i]<nums[j]){
                         int t=nums[j];
                         nums[j]=nums[i];
                         nums[i]=t;
                   }
               }
           }
       }
       return nums;
   }
}
/*
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 */
