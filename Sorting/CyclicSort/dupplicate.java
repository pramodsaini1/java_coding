package Sorting.CyclicSort;

public class dupplicate {
    public  static int findDuplicate(int []nums){
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
        // find the duplicate element

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
