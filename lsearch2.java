public class lsearch2 {
    public static void main(String[] args) {
        int arr[]={1,3,23,56,25,5,78};
         
        System.out.println(linearsearch3(arr,78));
    }
    static boolean linearsearch3(int arr[],int target){
        if (arr.length==0) {
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
