public class minMoves {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int min=0,max=nums.length-1;
        int mid=(min+max)/2;
        for(int i=0;i<nums.length;i++){
            ans +=Math.abs(nums[mid]-nums[i]);
        }
        return ans;
    }
}
/*
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
Example 2:

Input: nums = [1,10,2,9]
Output: 16
 */
