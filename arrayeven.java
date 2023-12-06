public class arrayeven {
    public static void main(String[] args) {
        int arr[]={18,124,9,1764,98,1};
        System.out.println(findnumber(arr));
    }
    static int findnumber(int []nums){
        int count=0;
       for(int i=0;i<nums.length;i++){
            
           if(nums[i]>0){
               int a=nums[i]%10;
              if(check(a)){
                count++;
              }
               nums[i]=nums[i]/10;
           }
       }
        return count;
    }
    static boolean check(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
