package BinarySearch.matrix;
import java.util.*;
public class simplesearch {
    public static void main(String[] args) {
        int arr[][]={{18,9,12},{36,-4,91},{44,33,16}};
        int target=91;
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        System.out.println(ans);
    }
    
}
