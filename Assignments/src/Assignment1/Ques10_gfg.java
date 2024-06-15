package Assignment1;
import java.util.*;
public class Ques10_gfg {
    //Smallest number divisible by n and has at-least k trailing zeros
    static int getRounding(int n,int k){
        int round=(int)Math.pow(10,k);
        int a=gcd(round,n);
        int ans=(n*round)/a;
        return ans;
    }
    static int gcd(int a,int b){
        while(b != 0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

//    public static void main(String[] args) {
//        System.out.println(getRounding(30,3));
//    }
}
