package Assignment1;

public class Ques5_MinNumberOfJumps {
    static int minJumps(int[] arr,int n) {
        int maxR = arr[0];
        int steps = arr[0];
        int jumps = 1;
        if (n == 1) return 0;
        if (arr[0] == 0) return -1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;
            maxR = Math.max(maxR, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxR) {
                    return -1;
                }
                steps = maxR - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={3,4,2,1,3,4};
        System.out.println(minJumps(arr,6));
    }
}
