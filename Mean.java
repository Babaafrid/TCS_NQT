import java.util.*;

public class Mean {
    private static double findAverage(int[] arr, int n){
        double sum = 0;
        for(int i=0;i<n;i++){
            sum+= (double) arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findAverage(arr,n));
    }
}
