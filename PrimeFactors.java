import java.util.Scanner;

public class PrimeFactors {
    private static void findprimefactors(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0) System.out.print(i+" ");
            while(n%i==0) n/=i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findprimefactors(n);
    }
}
