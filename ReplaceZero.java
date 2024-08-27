import java.util.Scanner;

public class ReplaceZero {
    private static int replace(int n){
        int temp=1,ans=0;
        while(n>0){
            int d = n%10;
            if(d==0) d=1;
            ans += temp*d;
            temp *= 10;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(replace(n));
    }
}
