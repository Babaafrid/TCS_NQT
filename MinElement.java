import java.util.*;
public class MinElement {

    private static int findMin(int[]arr,int n){
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr,n));
    }
}
