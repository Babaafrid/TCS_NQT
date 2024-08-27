import java.util.Scanner;

public class RemoveCharacters {
    private static void removecharacters(String s){
        String str = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')|| (s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removecharacters(s);
    }
}
