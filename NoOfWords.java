import java.util.Scanner;

public class NoOfWords {
    private static int printCount(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') count++;
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(printCount(s));
    }
}
