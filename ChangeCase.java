import java.util.Scanner;

public class ChangeCase {
    private static void changeCase(String s){
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans += Character.toUpperCase(s.charAt(i));
            } else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans += Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        changeCase(s);
    }
}
