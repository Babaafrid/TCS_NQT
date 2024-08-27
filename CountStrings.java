import java.util.Scanner;

public class CountStrings {
    private static void findcount(String s){
        int vowels=0,consonants=0,spaces=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                consonants++;
            }
            else if(s.charAt(i)==' '){
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        findcount(s);
    }
}
