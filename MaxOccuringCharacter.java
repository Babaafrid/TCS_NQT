import java.util.Scanner;

public class MaxOccuringCharacter {
    private static char maxOccurring(String s){
        int[] freq = new int[200];
        int max=0;
        char ch = 'a';
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
            if(freq[s.charAt(i)]>max){
                max = freq[s.charAt(i)];
                ch = s.charAt(i);
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maxOccurring(s));
    }
}
