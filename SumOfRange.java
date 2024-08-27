import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int rightsum = r*(r+1)/2;
        int leftsum = l*(l-1)/2;
        System.out.println(rightsum-leftsum);
    }
}
