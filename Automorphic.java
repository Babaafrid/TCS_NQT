import java.util.Scanner;

public class Automorphic {
    private static boolean isAutomorphic(int n){
        int sq = n*n;
        while(n>0){
            if(sq%10!=n%10) return false;
            n/=10;
            sq/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAutomorphic(n)) System.out.println(n + " is a automorphic number");
        else System.out.println(n + " is not a automorphic number");
    }
}
