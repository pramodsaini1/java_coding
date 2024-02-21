import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int lucky=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(checkLucky(matrix,i,j)){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
    private boolean checkLucky(int [][]matrix,int row,int col){
        int element=matrix[row][col];
        //check smallest in the row
        for(int j=0;j<matrix[row].length;j++){
            if(matrix[row][j]<element &&j!=col){
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]>element &&i!=row){
                return false;
            }
        }
        return true;
    }
}
/*
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */
