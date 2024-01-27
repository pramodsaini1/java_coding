package Recursion.String;

public class skipappnotapple {
    public static void main(String[] args) {
        System.out.println(skipappnotapple("bcdapplefg"));
    }
    public static String skipappnotapple(String up){
        if(up.isEmpty()){
            return "";
        }
         if(up.startsWith("app") && !up.startsWith("apple")){
            return skipappnotapple( up.substring(3));
         }
         return up.charAt(0)+skipappnotapple(up.substring(1));
    }
}
