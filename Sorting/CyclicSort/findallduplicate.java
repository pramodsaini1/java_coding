package Sorting.CyclicSort;
import java.util.*;
public class findallduplicate {
    public static List<Integer> findAllDuplicatesNumbers(int []nums){
         int i=0;
         while (i<nums.length) {
            int curr=nums[i]-1;
            if(nums[i]!=nums[curr]){
                int temp=nums[i];
                nums[i]=nums[curr];
                nums[curr]=temp;
            }
            else{
                i++;
            }
         }
         //find the duplicate elements in the array
         List<Integer> ans = new ArrayList<>();
         for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
         }
         return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicatesNumbers(arr));
    }
}
