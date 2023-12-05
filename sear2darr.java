public class sear2darr {
    public static void main(String[] args) {
        int arr[][]={{23,4,1},{18,12,3,9},{78,99,34,56},{18,12}};
        int target=34;
        System.out.println(search(arr,target));
    }
    static int search(int arr[][],int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
}
