package cyntexa;

public class countspecialposition {
    public int numSpecial(int[][] mat) {
        int count=0;
         int rows = mat.length, cols = mat[0].length;
        int rowSum[] = new int[rows], colSum[] = new int[cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                  rowSum[r] += mat[r][c];
            }
        }
        for(int c = 0; c < cols; c++){
            for(int r = 0; r < rows; r++){
                  colSum[c] += mat[r][c];
            }
        }
        int s = 0;
        for(int r = 0; r<rows; r++){
            for(int c = 0; c < cols; c++){
                if(mat[r][c] == 1 && rowSum[r] == 1 && colSum[c] == 1)s++;
            }
        }
        return s;
    }
}
/*
 * Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

 

Example 1:


Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
Example 2:


Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 */
