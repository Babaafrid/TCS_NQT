import java.util.Scanner;

public class PositionOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();

        int index = text.indexOf(pattern);
        System.out.println(index);
    }
}
