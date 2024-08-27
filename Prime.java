import java.util.Scanner;

public class Prime {
    private static boolean isprime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isprime(n)) {
            System.out.println(n + " is a prime.");
        } else {
            System.out.println(n + " is not a prime.");
        }
    }
}
