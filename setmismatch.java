public class setmismatch {
    public int[] findErrorNums(int[] nums) {
        
        
        int dupp=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    dupp=nums[i];
                }
            }
        }
         int sumofarr=0,sumofnat=0;
        sumofnat=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sumofarr=sumofarr+nums[i];
        }
        int miss=sumofnat-sumofarr+dupp;
        return new int[]{dupp,miss};
        
    }
}
/*
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104
 */
