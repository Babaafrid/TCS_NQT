import java.util.Scanner;

public class SecondMaxandMin {
    private static int findSecondMax(int[] arr,int n){
        if(n<2) return -1;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max1 = Math.max(arr[i],max1);
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=max1){
                max2 = Math.max(arr[i],max2);
            }
        }
        return max2;
    }
    private static int findSecondMin(int[] arr, int n){
        if(n<2) return -1;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min1 = Math.min(arr[i],min1);
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=min1){
                min2 = Math.min(arr[i],min2);
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSecondMax(arr,n));
        System.out.println(findSecondMin(arr,n));
    }
}
