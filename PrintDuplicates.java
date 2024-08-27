import java.util.Scanner;

public class PrintDuplicates {
    private static void printduplicates(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1) System.out.println((char) (i + 'a') +" "+ freq[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printduplicates(s);
    }
}