import java.util.*;

public class Symmetric {
    private static void findSymmetric(int[][] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.get(second)!=null && map.get(second) == first){
                System.out.println(first +" "+ second);
            }
            else{
                map.put(first,second);
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        findSymmetric(arr);
    }
}