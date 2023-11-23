public class sdsum {
    public static void main(String[] args) {
        int n=35422;
        int v=0;
        while(n>9){
            v=0;
            while(n>0){
                v=v+n%10;
                n=n/10;
            }
            n=v;
        }
        System.out.println(v);
    }
}
