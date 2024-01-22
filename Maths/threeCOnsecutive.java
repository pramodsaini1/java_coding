package Maths;

public class threeCOnsecutive {
    public long[] sumOfThree(long num) {
        long arr[]=new long[3];
        long no1=num/3;
        long sum =(no1-1)+no1+(no1+1);
        if(sum==num){
            arr[0]=no1-1;
            arr[1]=no1;
            arr[2]=no1+1;
        }
        else{
            return new long[0];
        }
        return arr;
    }
}
/*
 * Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.

 

Example 1:

Input: num = 33
Output: [10,11,12]
Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
Example 2:

Input: num = 4
Output: []
Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
 */
