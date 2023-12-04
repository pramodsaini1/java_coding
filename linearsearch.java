public class linearsearch {
    public static void main(String[] args) {
        int arr[]={23,45,1,2,3,4,-4,18,9};
        int ans=linearsearch(arr, 9);
        System.out.println(ans);
    }
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
