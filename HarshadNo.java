import java.util.Scanner;

public class HarshadNo {
    private static boolean isHarshadno(int n){
        int temp = n;
        int sum = 0;
        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return n%sum==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isHarshadno(n)) System.out.println(n + " is Harshad Number");
        else System.out.println(n + " is not a Harshad Number");
    }
}
