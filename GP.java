import java.util.Scanner;

public class GP {
    private static double gpsum(double a, double r, int n){
        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum+=a;
            a = a*r;
        }
        return sum;
    }
    private static double gpsum1(double a, double r, int n){
        return a * (Math.pow(r,n)-1)/(r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double r = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(gpsum(a,r,n));
        System.out.println(gpsum1(a,r,n));
    }
}
