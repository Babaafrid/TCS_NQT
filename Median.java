import java.util.*;

public class Median {
    private static double findMedian(int[] arr, int n){
        if(n%2==0){
            return (double)(arr[n/2]+arr[(n/2)-1])/2;
        }
        return arr[n/2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMedian(arr,n));
    }
}
