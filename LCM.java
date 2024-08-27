import java.util.Scanner;

public class LCM {
    private static int findgcd(int a, int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a*b)/findgcd(a,b));
    }
}
