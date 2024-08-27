import java.util.Scanner;

public class MaxandMinDigits {
    private static void maxandmin(int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n>0){
            max = Math.max(max,n%10);
            min = Math.min(min,n%10);
            n/=10;
        }
        System.out.println("Max Digit is "+ max);
        System.out.println("Min Digit is "+ min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maxandmin(n);
    }
}
