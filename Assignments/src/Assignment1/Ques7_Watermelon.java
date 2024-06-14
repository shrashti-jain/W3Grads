package Assignment1;
import java.util.Scanner;
public class Ques7_Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0 && n > 2) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
