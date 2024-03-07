package cyntexa;

public class apla1 {
    public static void main(String[] args) {
        int m,n=69;
        for(int i=1;i<=5;i++){
            m=n;
            for(int j=1;j<=i;j++){
                System.out.print((char)m+" ");
                m=m-1;
            }
            System.out.println();
            n=n-1;
        }
    }
}
