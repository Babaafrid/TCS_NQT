import java.util.Scanner;

public class Palindromes {
    private static boolean ispalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp>0){
            rev = (rev*10) + temp%10;
            temp/=10;
        }
        return n==rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<b;i++){
            if (ispalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
