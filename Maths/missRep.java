package Maths;

public class missRep {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
           
        int num []=new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                num[grid[i][j]]++;
            }
        } 
        int a=0,b=0;
        for(int i=1;i<num.length;i++){
            if(num[i]==2){
                a=i;
            }
            else if(num[i]==0){
                b=i;
            }
        }
        return new int []{a,b};
     }
}
/*
 * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

 

Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
Example 2:

Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
 
 */
