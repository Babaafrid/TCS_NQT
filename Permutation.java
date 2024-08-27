import java.util.Scanner;

public class Permutation {
    private static int findpermutation(int n, int r){
        int ans = 1;
        for(int i=n;i>=n-r+1;i--){
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(findpermutation(n,r));
    }
}
