import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    private static int findMax(int[] arr, int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr,n));
    }
}
