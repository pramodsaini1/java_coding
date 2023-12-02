public class monotonicarray {
    public boolean isMonotonic(int[] nums) {
        int c1=0,c2=0;
         for(int i=0;i<nums.length-1;i++){
             if(nums[i]<=nums[i+1])
                 c1++;
             if(nums[i]>=nums[i+1])
                 c2++;
         }
         return (c1==nums.length-1 || c2==nums.length-1);
     }
}
/*
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 */
