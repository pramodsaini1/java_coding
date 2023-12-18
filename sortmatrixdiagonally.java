import java.util.ArrayList;
import java.util.Collections;

public class sortmatrixdiagonally {
     public int[][] diagonalSort(int[][] mat) {
        int arr[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat[0].length;i++){
            ArrayList<Integer>list=new ArrayList<>();
            int ind=0;
            int ind1=i;
            while(ind<mat.length&&ind1<mat[0].length){
                list.add(mat[ind][ind1]);
                ind++;
                ind1++;
            }
            ind =0;
            ind1=i;
            Collections.sort(list);
            while(ind<mat.length&&ind1<mat[0].length){
                arr[ind][ind1]=list.get(ind);
                ind++;
                ind1++;
            }
        }
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer>list=new ArrayList<>();
            int ind1=i;
            int ind=0;
            while(ind1<mat.length&&ind<mat[0].length){
                list.add(mat[ind1][ind]);
                ind1++;
                ind++;
            }
            Collections.sort(list);
            ind1=i;
            ind=0;
            while(ind1<mat.length&&ind<mat[0].length){
                arr[ind1][ind]=list.get(ind);
                ind1++;
                ind++;
            }
        }
        return arr;
    }
}
/*
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.

 

Example 1:


Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
Example 2:

Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]
 */
