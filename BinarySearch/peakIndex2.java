package BinarySearch;

public class peakIndex2 {
    public int[] findPeakGrid(int[][] mat) {
        int start=0;
        int end=mat[0].length-1;
        int peakRowIndex=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            int max=-1;
            int row=maxIndex(mat,mid);

            if(mat[row][mid]<mat[row][mid+1]){
                start=mid+1;
            }
            else{
                peakRowIndex=row;
                end=mid;
            }
        }
        if(peakRowIndex == -1){
           peakRowIndex = maxIndex(mat, start);
       }
       return new int[]{peakRowIndex, start};
   }
   public int maxIndex (int[][] mat, int col ){
           int max = -1;
           int rowIndex = -1;
           for(int i = 0; i<mat.length; i++){
                if(mat[i][col] > max){
                   max = mat[i][col];
                   rowIndex = i;
               }
           }
           return rowIndex;
   }
}
/*
 * A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.

Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].

You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.

 

Example 1:



Input: mat = [[1,4],[3,2]]
Output: [0,1]
Explanation: Both 3 and 4 are peak elements so [1,0] and [0,1] are both acceptable answers.
Example 2:



Input: mat = [[10,20,15],[21,30,14],[7,16,32]]
Output: [1,1]
Explanation: Both 30 and 32 are peak elements so [1,1] and [2,2] are both acceptable answers.
 
 */
