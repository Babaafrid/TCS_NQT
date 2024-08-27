import java.util.Scanner;

public class Anagrams {
    private static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int[] freq = new int[26];
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'A']++;
        }
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'A']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(isAnagram(s1,s2)){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else{
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}
