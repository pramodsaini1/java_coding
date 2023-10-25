class recursion{
    public void display(int i){
        if(i<=5){
            System.out.println(i+"");
            display(i+1);
        }
    }
    public static void main(String []arr){
        int i=1;
        recursion obj = new recursion();
        obj.display(i);
    }
}