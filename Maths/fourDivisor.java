package Maths;

public class fourDivisor {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
             int num=nums[i];
             int count=0;
             int sumOfDivisor=0;
             for(int j=1;j<=Math.sqrt(num);j++){
                 if(num%j==0){
                     if(j*j==num){
                         count++;
                         sumOfDivisor +=j;
                     }
                     else{
                         count +=2;
                         sumOfDivisor +=(j+(num/j));
                     }
                 }
             }
              if(count==4){
                 sum +=sumOfDivisor;
         }
              
        }
        
             return sum;
    }
}
/*
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.

 

Example 1:

Input: nums = [21,4,7]
Output: 32
Explanation: 
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.
Example 2:

Input: nums = [21,21]
Output: 64
Example 3:

Input: nums = [1,2,3,4,5]
Output: 0
 
 */
