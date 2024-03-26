package cyntexa;

import java.util.Arrays;

public class smallestintoarrays {
    public int minNumber(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                    return nums1[i];
                 }
                  
            }
        }
        int min=Math.min(nums1[0],nums2[0]);
        int max=Math.max(nums1[0],nums2[0]);
        return min*10+max;
    }
}
/*
 * Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.
 

Example 1:

Input: nums1 = [4,1,3], nums2 = [5,7]
Output: 15
Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
Example 2:

Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
Output: 3
Explanation: The number 3 contains the digit 3 which exists in both arrays.
 */
