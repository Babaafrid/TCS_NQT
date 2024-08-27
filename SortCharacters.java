import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    private static void sortString(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String ans = new String(ch);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sortString(s);
    }
}
