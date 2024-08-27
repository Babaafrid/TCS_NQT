import java.util.Scanner;

public class RemoveCharacters2 {
    private static void removeCharacters(String s1, String s2){
        int[] freq = new int[256];
        String ans = "";
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)]--;
        }
        for(int i=0;i<s1.length();i++){
            if(freq[s1.charAt(i)]==1) ans+=s1.charAt(i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        removeCharacters(s1,s2);
    }
}
