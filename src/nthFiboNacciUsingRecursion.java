import java.util.*;
public class nthFiboNacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println(nthFiboNacciUsingRecursion.getNthFib(5));
    }
        public static int getNthFib(int n) {
            if(n==1){
                return 0;
            }
            if(n==2){
                return 1;
            }
            else
                return getNthFib(n-1)+getNthFib(n-2);
        }
}
