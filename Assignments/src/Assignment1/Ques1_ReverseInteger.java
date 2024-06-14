package Assignment1;

public class Ques1_ReverseInteger {
    public int reverse(int x) {
        long digit=0;
        while(x!=0){
            long rem=x%10;
            digit =digit*10 + rem;
            x=x/10;
        }
        // System.out.println(digit);
        int min=(int)Math.pow(-2,31);
        int max=(int)Math.pow(2,31)-1;
        //int num=Integer.parseInt(digit);
        if(digit>min && digit<max){
            return (int)digit;
        }
        return 0;
    }
}

