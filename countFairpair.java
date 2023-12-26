public class countFairpair {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long pairs=helper(nums,upper)-helper(nums,lower-1);
        return pairs;
   }
   public long helper(int []nums,int target){
       int l=0;
       int r=nums.length-1;
       long sum=0;
       while(l<=r){
          if(nums[l]+nums[r]<=target){
              sum +=(r-l);
              l++;
          }
          else{
              r--;
          }
       }
       return sum;
   }
}
/*
 * Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.

A pair (i, j) is fair if:

0 <= i < j < n, and
lower <= nums[i] + nums[j] <= upper
 

Example 1:

Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
Output: 6
Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
Example 2:

Input: nums = [1,7,9,2,5], lower = 11, upper = 11
Output: 1
Explanation: There is a single fair pair: (2,3).
 */
