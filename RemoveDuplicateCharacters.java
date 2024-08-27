import java.util.Scanner;

public class RemoveDuplicateCharacters {
    private static void removeduplicates(String s){
        int[] freq = new int[26];
        String ans = "";
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a']==1) ans += s.charAt(i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        removeduplicates(s);
    }
}
