class detobin{
    static int find(int dec){
        if(dec==0){
            return 0;
        }
        else{
            return (dec%2+10*find(dec/2));
        }
    }
    public static void main(String []arr){
        int decimal=10;
        System.out.println(find(decimal));
    }
}