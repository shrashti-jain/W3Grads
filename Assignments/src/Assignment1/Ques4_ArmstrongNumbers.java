package Assignment1;

public class Ques4_ArmstrongNumbers {
    static String armstrongNumber(int n) {
        // code here
        int digits = (int) Math.log10(n) + 1;
        int sum = 0, num = n;
        //System.out.println(digits);
        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, digits);
            n = n / 10;
        }
        //System.out.println(sum);
        if (sum == num) return "Yes";
        return "No";
    }
}
