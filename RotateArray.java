import java.util.*;

public class RotateArray {
    private static void rotate(int[] arr, int n, int k){
        int temp[] = new int[n];
        int x = 0;
        k = k%n;
        for(int i=k;i<n;i++){
            temp[x++] = arr[i];
        }
        for(int i=0;i<k;i++){
            temp[x++] = arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
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
        int k = sc.nextInt();
        rotate(arr,n,k);
    }
}
