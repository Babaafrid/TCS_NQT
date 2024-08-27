import java.util.Scanner;

public class GCD {
    private static int findgcd(int a,int b){
        int res = Math.min(a,b);
        while(res-->0){
            if (a%res==0 && b%res==0) return res;
        }
        return res;
    }
    private static int findgcd1(int a, int b){
        if(b==0) return a;
        return findgcd1(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findgcd(a,b));
        System.out.println(findgcd1(a,b));
    }
}
