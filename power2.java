import java.util.*;
public class power2 {
    public static void main(String args[]){
        int n=8388608;
        if((n&(n-1))==0){
        System.out.println("power of2");
        }
        else{
            System.out.println("not a power of 2");
        }
    }
}
