import java.util.Scanner;

public class Roots {
    private static void findroots(int a, int b, int c){
        if(a==0) System.out.println("Invalid");

        int d = b*b - 4*a*c;
        double sq = Math.sqrt(Math.abs(d));
        if(d>0){
            System.out.println("Roots are real and different ");
            double root1 = (double)(-b + sq) / (2 * a);
            double root2 = (double)(-b - sq) / (2 * a);
            System.out.println(root1 + "\n"+root2);
        }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            double root1 = -(double)b / (2 * a);
            double root2 = -(double)b / (2 * a);
            System.out.println(root1 + "\n"+root2);
        }
        else
        {
            System.out.println("Roots are complex ");
            System.out.println(-(double)b / (2 * a) + " + i"+ sq + "\n"+
                    -(double)b / (2 * a) + " - i" + sq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findroots(a,b,c);
    }
}
