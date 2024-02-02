package Recursion.Permutation;

public class fourComb {
    public static void main(String[] args) {
        fourCombination("", 4);
    }
    static void fourCombination(String p,int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6 && i<=target;i++){
            fourCombination(p+i, target-i);
        }

    }
}
