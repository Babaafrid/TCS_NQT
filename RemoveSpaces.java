import java.util.Scanner;

public class RemoveSpaces {
    private static void removespaces(String s){
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                str+=s.charAt(i);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removespaces(s);
    }
}
