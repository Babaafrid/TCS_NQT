import java.util.Scanner;

public class RemoveDuplicatesSorted {
    private static int removeduplicates(int[]arr, int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = removeduplicates(arr,n);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
