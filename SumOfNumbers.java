import java.util.Scanner;

public class SumOfNumbers {
    private static void findsum(String s) {
        String temp = "0";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                temp+=c;
            }
            else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.println(sum+Integer.parseInt(temp));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findsum(s);
    }
}
