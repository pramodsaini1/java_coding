public class arravg {
    public double findMaxAverage(int[] nums, int k) {
        double s=0.0;
        for(int i=0;i<k;i++)
            s+=(double)nums[i];
        double max=s/k;       
        for(int i=k;i<nums.length;i++)
        {
            s=s+nums[i]-nums[i-k];            
            max=Math.max(s/k,max);
        }
        return max;
    }
}
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 */ 
