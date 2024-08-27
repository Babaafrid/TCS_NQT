import java.util.*;

public class RearrangeArray {
    private static void rearrange(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rearrange(arr,n);
    }
}
