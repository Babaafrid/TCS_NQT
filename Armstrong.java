import java.util.*;

public class Armstrong {
    private static boolean isarmstrong(int n){
        int temp = n;
        int len = 0;
        while(temp>0){
            len++;
            temp/=10;
        }
        temp = n;
        int sum=0;
        while(temp>0){
            sum+=(int)Math.pow(temp%10,len);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isarmstrong(n)) {
            System.out.println(n + " is a Armstrong number.");
        } else {
            System.out.println(n + " is not a Armstrong number.");
        }
    }
}
