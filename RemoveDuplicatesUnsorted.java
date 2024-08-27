import java.util.*;

public class RemoveDuplicatesUnsorted {
    private static void removeduplicates(int[] arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                map.put(arr[i],1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        removeduplicates(arr,n);
    }
}
