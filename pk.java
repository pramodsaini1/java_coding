interface A{
    void display();
}
interface B{
    void show();
}
class pk extends A,B{
    public void display(){
        System.out.println("display");
    }
    public void show(){
        System.out.println("show");
    }
    public static void main(String []arr){
        pk obj = new pk();
        obj.show();
        obj.display();
    }
}