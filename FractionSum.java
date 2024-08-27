import java.util.Scanner;

public class FractionSum {
    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    private static void simplify(int num3, int den3){
        num3/=gcd(num3,den3);
        den3/=gcd(num3,den3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();

        int den3 = (den1*den2)/gcd(den1,den2);
        int num3 = num1*den3/den1 + num2*den3/den2;

        System.out.println(num3 + "/" + den3);
    }
}
