import java.util.Scanner;

public class NextLexicographicCharacter {
    private static void printNextCharacters(String str){
        String s = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='Z') s+='A';
            else if(str.charAt(i)=='z') s+='a';
            else s += (char)(str.charAt(i)+1);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printNextCharacters(str);
    }
}
