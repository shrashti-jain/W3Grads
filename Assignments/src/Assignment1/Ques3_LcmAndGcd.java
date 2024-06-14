package Assignment1;
import java.util.*;
public class Ques3_LcmAndGcd {
    public static Long[] lcmAndGcd(Long A , Long B) {
        Long[] ans=new Long[2];
        ans[0]=lcm(A,B);
        ans[1]=gcd(A,B);
        return ans;
    }
    static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }

    static long gcd(long a, long b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;

            if(a==0){
                return b;
            }
            if(b==0){
                return a;
            }
        }
        return 1;
    }
}
