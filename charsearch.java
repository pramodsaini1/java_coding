public class charsearch {
    public static void main(String[] args) {
        String name="pramod";
        char target='m';
        System.out.println(search(name,target));
    }
    public static boolean search(String name, char target){
          if (name.length() == 0) {
              return false;
          }
          for (int i = 0; i <name.length(); i++) {
              if (name.charAt(i)==target) {
                  return true;
              }
          }
          return false;
    }
}
