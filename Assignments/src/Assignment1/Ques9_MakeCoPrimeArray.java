package Assignment1;

public class Ques9_MakeCoPrimeArray {
    int countCoPrime(int a[], int n)
    {
        int ans=0;
        for(int i=0; i<n-1; i++){
            if(gcd(a[i],a[i+1]) != 1) ans++;
        }
        return ans;
    }
    long gcd(long a, long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
