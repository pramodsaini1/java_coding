class pattern{
    int n;
    public void jseries(int j){
        if(j<=n){
            System.out.print(j+" ");
            jseries(j+1);
        }
    }
    public void iseries(int i){
        if(i<=5){
            n=i;
            jseries(1);
            System.out.println();
            iseries(i+1);
        }
    }
    public static void main(String []arr){
        int i=1;
        display(i);
    }
}



/*  ---------output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5






 */ 