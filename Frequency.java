import java.util.*;

public class Frequency {
    private static void countfrequency(int[] arr, int n){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],1+mp.getOrDefault(arr[i],0));
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       countfrequency(arr,n);
    }
}