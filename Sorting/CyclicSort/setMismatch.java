package Sorting.CyclicSort;

public class setMismatch {
    public static int [] findErrorNumber(int []nums){
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
          //find the missing element in the array
          for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
          }
          return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.println(findErrorNumber(arr));
    }
}
