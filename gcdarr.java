public class gcdarr {
    public int subarrayGCD(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(temp==k){
                ans++;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>=k){
                    temp=gcd(nums[j],temp);
                    if(temp==k){
                        ans++;
                    }
                }
                else{
                    break;
                }
            }
        }
    return ans;
    }
    public static int gcd(int a, int b){ 
        return b==0?a:gcd(b,a%b);     
    } 

}
/*
 * Given an integer array nums and an integer k, return the number of subarrays of nums where the greatest common divisor of the subarray's elements is k.

A subarray is a contiguous non-empty sequence of elements within an array.

The greatest common divisor of an array is the largest integer that evenly divides all the array elements.

 

Example 1:

Input: nums = [9,3,1,2,6,3], k = 3
Output: 4
Explanation: The subarrays of nums where 3 is the greatest common divisor of all the subarray's elements are:
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
Example 2:

Input: nums = [4], k = 7
Output: 0
Explanation: There are no subarrays of nums where 7 is the greatest common divisor of all the subarray's elements.
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i], k <= 109
 */
