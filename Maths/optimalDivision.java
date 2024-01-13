package Maths;

public class optimalDivision {
    public String optimalDivision(int[] nums) {
        String s="";
        int n=nums.length;
        if(n==1){
            return s+nums[0];
        }
        else if(n==2){
            s=s+nums[0]+"/"+nums[1];
            return s;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                s=s+nums[i];
                s=s+"/";
                s=s+"(";
            }
            else if(i==(n-1)){
                s=s+nums[i];
            }
            else{
                s=s+nums[i];
                s=s+"/";
            }
        }
        s=s+")";
        return s;
    }
}
/*
 * You are given an integer array nums. The adjacent integers in nums will perform the float division.

For example, for nums = [2,3,4], we will evaluate the expression "2/3/4".
However, you can add any number of parenthesis at any position to change the priority of operations. You want to add these parentheses such the value of the expression after the evaluation is maximum.

Return the corresponding expression that has the maximum value in string format.

Note: your expression should not contain redundant parenthesis.

 

Example 1:

Input: nums = [1000,100,10,2]
Output: "1000/(100/10/2)"
Explanation: 1000/(100/10/2) = 1000/((100/10)/2) = 200
However, the bold parenthesis in "1000/((100/10)/2)" are redundant since they do not influence the operation priority.
So you should return "1000/(100/10/2)".
Other cases:
1000/(100/10)/2 = 50
1000/(100/(10/2)) = 50
1000/100/10/2 = 0.5
1000/100/(10/2) = 2
Example 2:

Input: nums = [2,3,4]
Output: "2/(3/4)"
Explanation: (2/(3/4)) = 8/3 = 2.667
It can be shown that after trying all possibilities, we cannot get an expression with evaluation greater than 2.667
 */
