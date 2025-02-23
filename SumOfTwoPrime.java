import java.util.Scanner;

public class SumOfTwoPrime {
    private static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)&&isPrime(n-2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
