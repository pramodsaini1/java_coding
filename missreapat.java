public class missreapat {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,2}};
         
        int nums[]=new int[arr.length*arr[0].length];
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               nums[(i*arr.length)+j]=arr[i][j];
           }
        }
        int rep=0,miss=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                  int temp=nums[j];
                  nums[j]=nums[i];
                  nums[i]=temp;
                }
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                rep=nums[i];
            }
        }
        int x1=nums[0];
        int x2=1;
        for(int i=1;i<nums.length;i++){
            x1=x1^nums[i];
        }
        for(int i=2;i<=nums.length+1;i++){
            x2=x2^i;
        }
        miss=x1 ^ x2;

        System.out.println(rep+"    "+miss);



    }
}
