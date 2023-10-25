class pattern{
    int m;
    public void jseries(int j){
        if(j<m){
            System.out.print(j+m+" ");
            jseries(j+1);
        }
    }
    public void iseries(int i){
        if(i<=5){
            m=i;
            jseries(0);
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
2 3
3 4 5
4 5 6 7
5 6 7 8 9






 */ 