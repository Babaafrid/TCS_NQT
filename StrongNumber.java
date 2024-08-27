import java.util.Scanner;

public class StrongNumber {
    private static int factorial(int n){
        if(n==0 || n==1) return 1;

        return n*factorial(n-1);
    }
    private static boolean isstrongnumber(int n){
        int temp = n;
        int facsum = 0;
        while(temp>0){
            facsum+=factorial(temp%10);
            temp/=10;
        }
        return facsum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isstrongnumber(n)){
            System.out.println(n + " is a strong number");
        }else{
            System.out.println(n + " is not a strong number");
        }
    }
}
