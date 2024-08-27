import java.util.Scanner;

public class NonRepeatingCharacters {
    private static void printNonrepeating(String s){
        int[] freq = new int[200];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                continue;
            else
                freq[(int)s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[(int) s.charAt(i)]==1 && s.charAt(i)!=' ') System.out.print(s.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "google";
        printNonrepeating(s);
    }
}
