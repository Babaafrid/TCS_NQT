import java.util.Scanner;

public class StringPalindrome {
    private static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrome(s)) System.out.println(s + " is a palindrome");
        else System.out.println(s + " is not a palindrome");
    }
}
