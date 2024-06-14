package Assignment1;
import java.util.*;
public class Ques6_SumOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int flag=0;
        while(t > 0){
            int n=sc.nextInt();
            if(n<7){
                System.out.println("NO");
            }
            else if((n-3) % 3 != 0 && n-3 != 2 && n-3 != 1){
                System.out.println("YES");
                System.out.print("1 2 ");
                System.out.println(n-3);
            }
            else if((n-5) % 3 != 0 && n-5 != 4 && n-5 != 1){
                System.out.println("YES");
                System.out.print("1 4 ");
                System.out.println(n-5);
            }
            else{
                System.out.println("NO");
            }
            --t;
        }
    }
}
