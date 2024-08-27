import java.util.*;

public class PerfectNumber {
    private static boolean isperfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        return n==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isperfect(n)) {
            System.out.println(n + " is a Perfect number.");
        } else {
            System.out.println(n + " is not a Perfect number.");
        }
    }
}
