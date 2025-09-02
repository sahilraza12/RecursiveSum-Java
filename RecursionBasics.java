import java.util.*;
public class RecursionBasics{
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = calcSum(n-1); 
        int fn = n + calcSum(n-1);
        return fn;

    }
    public static void main(String args[]){
    int n =10;
    System.out.println(calcSum(n)); 
    }
}
