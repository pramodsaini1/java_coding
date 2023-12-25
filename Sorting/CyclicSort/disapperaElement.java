package Sorting.CyclicSort;
import java.util.*;
public class disapperaElement {
       public static List<Integer> findDisapperaNumbers(int []nums){
             int i=0;
             while (i<nums.length) {
                int curr=nums[i]-1;
                if (nums[i]!=nums[curr]) {
                     int temp=nums[i];
                     nums[i]=nums[curr];
                     nums[curr]=temp;
                }
                else{
                    i++;
                }
             }
             // find the all missing numbers
             List<Integer> ans=new ArrayList<>();
             for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    ans.add(index+1);
                }
             }
             return ans;

       }
       public static void main(String[] args) {
           int arr[]={1,2,3,4,6,7,9};
           System.out.println(findDisapperaNumbers(arr));

       }
}
