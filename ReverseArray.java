import java.util.Scanner;

public class ReverseArray {
    private static void printreverse(int[] arr,int n){
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for (int i = 0; i < n; i++) {
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
        printreverse(arr,n);
    }
}
