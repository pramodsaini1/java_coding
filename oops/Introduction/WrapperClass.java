package oops.Introduction;

public class WrapperClass {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;

        Integer a=10;
        Integer b=20;

        Integer num=45;

        swap(a,b);
        System.out.println(a+" "+b);

        
    }
    static void swap(Integer a,Integer b){
         Integer temp=a;//Integer----final -----is a keyword-----
        a=b;
        b=temp;
    }
}
