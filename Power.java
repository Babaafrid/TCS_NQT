import java.util.Scanner;

public class Power {
    private static int findpow(int x, int n){
        return (int) Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findpow(x, n));
    }
}
