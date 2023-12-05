public class searrange {
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        int result=search(arr,3,1,4);
        System.out.println(result);
    }
    static int search(int arr[],int target,int start,int end){
        if (arr.length==0) {
            return -1;
        }
        for (int i = start; i <=end; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
