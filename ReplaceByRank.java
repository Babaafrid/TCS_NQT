import java.util.*;

public class ReplaceByRank {
    public static void main(String[] args) {
        int[] arr = {20,15,26,2,98,6};
        Map<Integer,Integer> map = new HashMap<>();
        int[] brr = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            brr[i] = arr[i];
        }
        Arrays.sort(brr);
        for(int i=0;i< brr.length;i++){
            map.put(brr[i],i+1);
        }
        for (int j : arr) {
            System.out.print(map.get(j) + " ");
        }
    }
}
