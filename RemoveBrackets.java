import java.util.Scanner;

public class RemoveBrackets {
    private static void removebrackets(String s){
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')' &&s.charAt(i)!='[' &&s.charAt(i)!=']'
                    &&s.charAt(i)!='{' &&s.charAt(i)!='}'){
                str+=s.charAt(i);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removebrackets(s);
    }
}
