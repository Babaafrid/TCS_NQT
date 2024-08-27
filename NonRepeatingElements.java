import java.util.*;

public class NonRepeatingElements {
    private static void findnonrepeating(int[] arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],1+map.getOrDefault(arr[i],0));
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
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
        findnonrepeating(arr,n);
    }
}
