import java.util.Scanner;

public class Ap {
    private static int apsum(int n, int a, int d){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=a+i*d;
        }
        return sum;
    }
    private static int apsum1(int n, int a, int d){
        return (int)((n/2) * (2*a+(n-1)*d));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(apsum(n,a,d));
        System.out.println(apsum1(n,a,d));
    }
}
