class finallyexc{
    public static void main(String []arr){
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={1,0,3,0};
        for(int i=0;i<a.length;i++){
            try{
                System.out.println(a[i]/b[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("out of Range");
            }
            catch(ArithematicException er){
                System.out.println("divide by zero");
            }
            finally{
                System.out.println("finally");
            }
        }

    }
}