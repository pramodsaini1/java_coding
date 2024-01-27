package Recursion.String;

public class skipApple {
    public static void main(String[] args) {
        System.out.println(skipApple("bcdapplefg"));
    }
    public static String skipApple(String up){
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }
        return up.charAt(0)+skipApple(up.substring(1));
    }
}
