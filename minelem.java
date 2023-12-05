public class minelem {
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
        if (arr.length==0) {
            return -1;
        }
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
}
