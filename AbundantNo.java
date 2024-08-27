import java.util.Scanner;

public class AbundantNo {
    private static boolean isAbundant(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        return sum>n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAbundant(n)) System.out.println(n + " is a Abundant number");
        else System.out.println(n + " is not a Abundant number");
    }
}
