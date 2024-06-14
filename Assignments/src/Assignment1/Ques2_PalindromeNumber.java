package Assignment1;

public class Ques2_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=0,X=x;
        while(X!=0){
            y=(y*10)+(X%10);
            X=X/10;
        }
        if(y==x){
            return true;
        }
        return false;
    }
}
