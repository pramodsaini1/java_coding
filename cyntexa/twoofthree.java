package cyntexa;

import java.util.ArrayList;
import java.util.List;

public class twoofthree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                for(int k=0;k<nums3.length;k++){
                    if(nums1[i]==nums2[j]||nums1[i]==nums3[k]){
                        if(!list.contains(nums1[i])){
                             list.add(nums1[i]);
                        }
                        }
                       if(nums2[j]==nums3[k]){
                           if(!list.contains(nums2[j])){
                               list.add(nums2[j]);
                           }
                       }
                }
            }
        }
        return list;
    }
}
/*
 * Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 

Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
 */
