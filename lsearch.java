public class lsearch {
    public static void main(String[] args) {
        int arr[]={10,30,2,34,5,12};
        int ans=linearsearch1(arr,5);
        System.out.println(ans);
    }
    static int linearsearch1(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        return -1;
    }
}
