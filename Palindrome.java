import java.util.Scanner;

public class Palindrome {
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
        int n = sc.nextInt();
        if (ispalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}
