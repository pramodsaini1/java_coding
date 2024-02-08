import java.util.ArrayList;
import java.util.Collections;

public class MakeArraySimilar {
    public long makeSimilar(int[] nums, int[] target) {
        ArrayList<Integer> even=new ArrayList<>();
         ArrayList<Integer> even1=new ArrayList<>();
          ArrayList<Integer> odd=new ArrayList<>();
           ArrayList<Integer> odd1=new ArrayList<>();

           for(int i=0;i<nums.length;i++){
               if(nums[i]%2==0) even.add(nums[i]);
               else odd.add(nums[i]);
           }
           for(int i=0;i<target.length;i++){
               if(target[i]%2==0) even1.add( target[i]);
               else odd1.add(target[i]);
           }
           Collections.sort(even);
           Collections.sort(odd);
           Collections.sort(even1);
           Collections.sort(odd1);

           long count=0;
           for(int i=0;i<even.size();i++){
               count +=Math.abs(even.get(i)-even1.get(i));
           }
           for(int i=0;i<odd.size();i++){
               count +=Math.abs(odd.get(i)-odd1.get(i));
           }
           return count/4;
        

        
    }
}
/*
 * You are given two positive integer arrays nums and target, of the same length.

In one operation, you can choose any two distinct indices i and j where 0 <= i, j < nums.length and:

set nums[i] = nums[i] + 2 and
set nums[j] = nums[j] - 2.
Two arrays are considered to be similar if the frequency of each element is the same.

Return the minimum number of operations required to make nums similar to target. The test cases are generated such that nums can always be similar to target.

 

Example 1:

Input: nums = [8,12,6], target = [2,14,10]
Output: 2
Explanation: It is possible to make nums similar to target in two operations:
- Choose i = 0 and j = 2, nums = [10,12,4].
- Choose i = 1 and j = 2, nums = [10,14,2].
It can be shown that 2 is the minimum number of operations needed.
Example 2:

Input: nums = [1,2,5], target = [4,1,3]
Output: 1
Explanation: We can make nums similar to target in one operation:
- Choose i = 1 and j = 2, nums = [1,4,3].
Example 3:

Input: nums = [1,1,1,1,1], target = [1,1,1,1,1]
Output: 0
Explanation: The array nums is already similiar to target.
 
 */
